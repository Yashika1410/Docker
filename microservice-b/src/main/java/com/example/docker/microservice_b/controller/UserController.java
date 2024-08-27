package com.example.docker.microservice_b.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.microservice_b.dto.UserRequest;
import com.example.docker.microservice_b.entities.User;
import com.example.docker.microservice_b.services.UserServices;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/microservice-b/users")
public class UserController {
    private final UserServices userServices;

    @GetMapping()
    public List<User> getUsers() {
        return userServices.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userServices.getUserById(id);
    }
    
    @PostMapping
    public User createUser(@RequestBody UserRequest userRequest) {
        return userServices.saveUser(userRequest);
    }
    

    
}
