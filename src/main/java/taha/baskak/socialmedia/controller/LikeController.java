package taha.baskak.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taha.baskak.socialmedia.model.like.LikeDTO;
import taha.baskak.socialmedia.model.like.UnLikeDTO;
import taha.baskak.socialmedia.service.LikeService;

import javax.validation.Valid;

@RestController
public class LikeController {
    @Autowired
    LikeService likeService;

    @GetMapping("/allLike")
    public ResponseEntity getAllLikes(){
        return new ResponseEntity(likeService.getAllLikes(), HttpStatus.OK);
    }

    @PostMapping("/like")
    public ResponseEntity like(@Valid @RequestBody LikeDTO like){
        return new ResponseEntity(likeService.like(like), HttpStatus.OK);
    }

    @PostMapping("/unLike")
    public ResponseEntity unLike(@Valid @RequestBody UnLikeDTO like){
        return new ResponseEntity(likeService.unLike(like) ?  HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
