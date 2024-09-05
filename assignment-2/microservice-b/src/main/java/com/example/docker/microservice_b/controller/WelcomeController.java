package com.example.docker.microservice_b.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/microservice-b")
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcome to microservice b";
    }
    
    
}
