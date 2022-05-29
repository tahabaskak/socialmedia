package taha.baskak.socialmedia.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import taha.baskak.socialmedia.model.user.UserDTO;
import taha.baskak.socialmedia.model.user.UserUpdateDTO;
import taha.baskak.socialmedia.service.UserService;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@Valid @RequestBody UserDTO user){
        return new ResponseEntity(userService.singUp(user), HttpStatus.CREATED);
    }

    @PutMapping("/updateUserInfo")
    public ResponseEntity updateUserInfo(@Valid @RequestBody UserUpdateDTO user){
        return new ResponseEntity(userService.updateUser(user), HttpStatus.OK);
    }
}
