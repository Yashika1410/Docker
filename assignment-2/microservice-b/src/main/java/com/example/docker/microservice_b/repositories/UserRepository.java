package com.example.docker.microservice_b.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.docker.microservice_b.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    
}
