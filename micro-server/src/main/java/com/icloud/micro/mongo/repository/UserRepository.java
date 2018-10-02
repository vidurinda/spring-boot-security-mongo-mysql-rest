package com.icloud.micro.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.icloud.micro.mongo.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    public User findByUsername(String username);
}
