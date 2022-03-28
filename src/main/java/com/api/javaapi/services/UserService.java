package com.api.javaapi.services;

import java.util.List;
import java.util.Optional;


import com.api.javaapi.model.User;
import com.api.javaapi.repository.UserRepository_old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository_old userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();

    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.getUserById(id);

    }

    public void deleteUser(Integer id) {
        userRepository.deleteUser(id);
    }

    public User updateUser(Integer id ,User user) {
        user.setUserId(id);
        return userRepository.updateUser(user);
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }
}
