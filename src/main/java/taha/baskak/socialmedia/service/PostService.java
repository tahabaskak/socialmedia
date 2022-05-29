package taha.baskak.socialmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taha.baskak.socialmedia.constant.Constant;
import taha.baskak.socialmedia.exception.CustomException;
import taha.baskak.socialmedia.util.Utility;
import taha.baskak.socialmedia.entity.Follow;
import taha.baskak.socialmedia.entity.Like;
import taha.baskak.socialmedia.entity.Post;
import taha.baskak.socialmedia.entity.User;
import taha.baskak.socialmedia.model.post.*;
import taha.baskak.socialmedia.model.user.UserResponseForAlgthmDTO;
import taha.baskak.socialmedia.repository.FollowRepository;
import taha.baskak.socialmedia.repository.LikeRepository;
import taha.baskak.socialmedia.repository.PostRepository;
import taha.baskak.socialmedia.repository.UserRepository;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FollowRepository followRepository;

    @Autowired
    LikeRepository likeRepository;

    public List<PostResponseDTO> getAllPosts(){
        List<Post> result = postRepository.findAll();
        List<PostResponseDTO> posts = new ArrayList<>();
        for (Post post : result) {
            posts.add(new PostResponseDTO(post.getId(),post.getDescription(),post.getUserID(),post.getImage(), Utility.DaysToDate(post.getCreatedDate())));
        }
        return posts;
    }

    public Post sendPost(PostRequestDTO postDTO){
        Post newPost = new Post(postDTO.getDescription(),postDTO.getUserID(),postDTO.getImage());
        return postRepository.save(newPost);
    }

    public boolean deletePost(DeletePostDTO post){
        Optional<Post> result = postRepository.findById(post.getPostId());
        if(result.isPresent()){
            postRepository.delete(result.get());
            // delete operation
            return true;
        }
        return false;
    }

    public MergeResponseDTO getMergePosts(MergePostsDTO mergePosts){
        // convert one list<Object>
        List<MergeResponsePostDTO> posts = mergePosts.getPostsID().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        // sort list
        posts.sort(Comparator.comparing(MergeResponsePostDTO::getCreatedAt)
                .thenComparing(i -> i.getId()).reversed());

        return new MergeResponseDTO(posts);
    }

    public List<PostResponseForAlgthmDTO> getPostById(GetPostsDTO getPosts){
        List<Post> resultPosts = postRepository.findByIdIn(getPosts.getPostsID());
        if(resultPosts.isEmpty()){
            throw new CustomException(Constant.POST_EMPTY);
        }

        Supplier<Stream<Post>> postStream =()-> resultPosts.stream();


        List<Integer> userIdList =  postStream.get().map(Post::getUserID).collect(Collectors.toList());
        List<User> resultUsers = userRepository.findByIdIn(userIdList);

        List<Follow> resultFollowings = followRepository.findByFollowerID(getPosts.getUserID());
        List<Like> resultLikeList = likeRepository.findAllByUserID(getPosts.getUserID());

        Supplier<Stream<User>> userStream = () -> resultUsers.stream();
        Supplier<Stream<Follow>> fallowingStream = () -> resultFollowings.stream();
        Supplier<Stream<Like>> likeStream = () -> resultLikeList.stream();

        List<PostResponseForAlgthmDTO> resultList = getPosts.getPostsID().stream().map(item -> {
            Post post = postStream.get().filter(subPost -> subPost.getId().equals(item)).findAny().orElse(null);

            // return null if post id is not found
            if(post == null){
                return null;
            }

            // find owner of current post
            User postUser = userStream.get().filter(subUser -> subUser.getId().equals(post.getUserID())).findFirst().get();

            // find is user following owner of current post
            Follow follow = fallowingStream.get().filter(subfallow -> subfallow.getFollowingID().equals(postUser.getId())).findAny().orElse(null);

            // initialize owner user
            UserResponseForAlgthmDTO owner = new UserResponseForAlgthmDTO(
                    postUser.getId(),
                    postUser.getUserName(),
                    postUser.getFullName(),
                    postUser.getProfilePicture(),
                    follow != null);

            // find is user liked current post
            Like like = likeStream.get().filter(subLike -> subLike.getPostID().equals(post.getId())).findAny().orElse(null);

            // initialize response object
            PostResponseForAlgthmDTO result = new PostResponseForAlgthmDTO(
                    post.getId(),
                    post.getDescription(),
                    owner,
                    Utility.DaysToDate(post.getCreatedDate()),
                    like != null);

            // return initialized post
            return result;
        }).collect(Collectors.toList());

        return resultList;
    }
}
