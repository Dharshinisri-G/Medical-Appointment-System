package com.medicalappointmentsystem.model;

public class User {
    private static int userIdCounter = 1;
    protected int userId;
    protected String name;
    protected String email;
    protected String contact;
    protected int age;
    protected String dob;
    protected String address;
    protected String username;
    protected String password;
    protected String role;

    public User(String name, String email, String contact, int age, String dob, String address, String username, String password, String role) {
        this.userId = userIdCounter++;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name + ", Role: " + role;
    }
}
