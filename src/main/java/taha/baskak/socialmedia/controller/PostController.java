package taha.baskak.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import taha.baskak.socialmedia.model.post.DeletePostDTO;
import taha.baskak.socialmedia.model.post.GetPostsDTO;
import taha.baskak.socialmedia.model.post.MergePostsDTO;
import taha.baskak.socialmedia.model.post.PostRequestDTO;
import taha.baskak.socialmedia.service.PostService;

import javax.validation.Valid;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/allPost")
    public ResponseEntity getAllPosts(){
        return new ResponseEntity(postService.getAllPosts(), HttpStatus.OK);
    }

    @PostMapping("/sendPost")
    public ResponseEntity sendPost(@Valid @RequestBody PostRequestDTO postDTO){
        return new ResponseEntity(postService.sendPost(postDTO), HttpStatus.OK);
    }

    @DeleteMapping("/deletePost")
    public ResponseEntity sendPost(@Valid @RequestBody DeletePostDTO post){
        return new ResponseEntity(postService.deletePost(post)? HttpStatus.OK :HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/getPosts")
    public ResponseEntity sendPost(@RequestBody GetPostsDTO post){
        return new ResponseEntity(postService.getPostById(post), HttpStatus.OK );
    }

    @PostMapping("/mergePosts")
    public ResponseEntity sendPost(@RequestBody MergePostsDTO post){
        return new ResponseEntity(postService.getMergePosts(post), HttpStatus.OK );
    }
}
