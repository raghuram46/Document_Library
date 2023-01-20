package com.stg.oauth2resourceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello Buddy";
    }

    @GetMapping("/api/message")
    public String SayHello(){
        return "Hello! Welcome to our  Cabin";
    }
}
