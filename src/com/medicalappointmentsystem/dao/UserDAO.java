package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.User;
import java.util.List;

public interface dfUserDAO {
    void registerUser(User user);
    User loginUser(String username, String password);
    List<User> getAllUsers();
}
