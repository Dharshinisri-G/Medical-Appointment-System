package com.medicalappointmentsystem.controller;

import com.medicalappointmentsystem.dao.UserDAO;
import com.medicalappointmentsystem.dao.impl.UserDAOImpl;
import com.medicalappointmentsystem.model.User;
import java.util.Scanner;

public class UserController {
    private UserDAO userDAO = new UserDAOImpl();
    private Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Contact: ");
        String contact = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        System.out.println("Enter Role (Admin / Hospital_Admin / Doctor / Patient): ");
        String role = scanner.nextLine();

        User user = new User(name, email, contact, age, dob, address, username, password, role);
        userDAO.registerUser(user);
        System.out.println("User Registered Successfully!");
    }

    public User loginUser() {
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        User user = userDAO.loginUser(username, password);
        if (user != null) {
            System.out.println("Login Successful!");
            return user;
        } else {
            System.out.println("Invalid Credentials!");
            return null;
        }
    }
}
