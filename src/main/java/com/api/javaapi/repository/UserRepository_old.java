package com.api.javaapi.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.api.javaapi.model.User;
import com.api.javaapi.model.exceptions.ResourceNotFound;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository_old {
    private List<User> users = new ArrayList<User>();
    private Integer incrementalId = 0;

    /**
     * Return user list
     * @return User list
     */

    public List<User> getAllUsers() {
     return users;   
    }


    public Optional<User> getUserById(Integer id) {
        return users.stream().filter(users -> users.getUserId() == id ).findFirst();

    }

    public User createUser(User user) {
            incrementalId++;

            user.setUserId(incrementalId);
            users.add(user);

            return user;
    }

    public void deleteUser(Integer id) {
        users.removeIf(users -> users.getUserId() == id);

        
    }

    public User updateUser(User user) {
        Optional<User> findedUser = getUserById(user.getUserId());

        if(findedUser.isEmpty()) {
            throw new ResourceNotFound("User not found");

        }

        deleteUser(user.getUserId());

        users.add(user);

        return user;

    }
}
