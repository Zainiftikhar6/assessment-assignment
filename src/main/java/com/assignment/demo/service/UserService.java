package com.assignment.demo.service;

import com.assignment.demo.model.User;
import com.assignment.demo.model.UserDto;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
