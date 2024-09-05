package com.example.docker.microservice_a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.microservice_a.model.User;
import com.example.docker.microservice_a.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/api/v1/microservice-a")
public class WelcomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcome to microservice a";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
