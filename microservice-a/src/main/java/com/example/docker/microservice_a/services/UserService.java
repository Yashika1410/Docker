package com.example.docker.microservice_a.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.docker.microservice_a.model.User;

@Service
public class UserService {
    List<User> list;

    public UserService() {
        list = new ArrayList<>();
        list.add(new User(1, "Tom", "tom@gmail.com"));
        list.add(new User(2, "Admin", "admin@gmail.com"));
    }


    public List<User> getUsers() {
        return list;
    }

}
