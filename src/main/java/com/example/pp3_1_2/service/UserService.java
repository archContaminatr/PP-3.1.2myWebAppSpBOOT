package com.example.pp3_1_2.service;

import com.example.pp3_1_2.entity.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> allUsers();
    void addUser(User user);
    void deleteUser(Long id);
    Optional<User> getById(Long id);
}
