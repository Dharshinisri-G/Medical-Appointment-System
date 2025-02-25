package com.medicalappointmentsystem.dao.impl;

import com.medicalappointmentsystem.dao.UserDAO;
import com.medicalappointmentsystem.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
