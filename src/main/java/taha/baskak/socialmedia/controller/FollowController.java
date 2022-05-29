package taha.baskak.socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taha.baskak.socialmedia.model.follow.FollowDTO;
import taha.baskak.socialmedia.model.follow.UnFollowDTO;
import taha.baskak.socialmedia.service.FollowService;

import javax.validation.Valid;

@RestController
public class FollowController {
    @Autowired
    FollowService followService;

    @GetMapping("/allFollow")
    public ResponseEntity getAllFollows(){
        return new ResponseEntity(followService.getAllFollows(), HttpStatus.OK);
    }

    @PostMapping("/follow")
    public ResponseEntity follow(@Valid @RequestBody FollowDTO follow){
        return new ResponseEntity(followService.follow(follow), HttpStatus.OK);
    }

    @PostMapping("/unFollow")
    public ResponseEntity unFollow(@Valid @RequestBody UnFollowDTO unFollow){
        return new ResponseEntity(followService.unFollow(unFollow) ?  HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }
}
