package com.example.docker.microservice_b.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.docker.microservice_b.dto.UserRequest;
import com.example.docker.microservice_b.entities.User;
import com.example.docker.microservice_b.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServices {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        return userRepository.save(user);
    }
    
}
