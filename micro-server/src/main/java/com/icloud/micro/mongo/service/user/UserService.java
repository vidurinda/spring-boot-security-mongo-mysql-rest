package com.icloud.micro.mongo.service.user;


import com.icloud.micro.mongo.model.User;

public interface UserService {
    public User findByUsername(String username);
}
