package taha.baskak.socialmedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taha.baskak.socialmedia.util.Utility;
import taha.baskak.socialmedia.entity.Like;
import taha.baskak.socialmedia.model.like.LikeDTO;
import taha.baskak.socialmedia.model.like.UnLikeDTO;
import taha.baskak.socialmedia.repository.LikeRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;

    public Like like(LikeDTO like){
        Like newLike = new Like(like.getPostID(),like.getUserID(), Utility.DateToDays(new Date()));
        return likeRepository.save(newLike);
    }

    public boolean unLike(UnLikeDTO unLike){
        Optional<Like> resultLike = likeRepository.findById(unLike.getLikeId());
        if(resultLike.isPresent()){
            likeRepository.delete(resultLike.get());
            // unlike operation
            return true;
        }
        return false;
    }

    public List<LikeDTO> getAllLikes(){
        List<Like> result = likeRepository.findAll();
        List<LikeDTO> likes = new ArrayList<>();
        for (Like like : result) {
            likes.add(new LikeDTO(like.getPostID(),like.getUserID()));
        }
        return likes;
    }
}
