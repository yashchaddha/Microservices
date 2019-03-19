package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //addconsecutive through url
    @GetMapping("/user/{name}")
    public ResponseEntity<User> getUserDetails(@PathVariable String name){
        return new ResponseEntity<User>(new User(1,name,20), HttpStatus.OK);
    }
}