package com.medicalappointmentsystem.model;

public class Admin extends User {
    private static int adminIdCounter = 1;
    private int adminId;

    public Admin(String name, String email, String contact, int age, String dob, String address, String username, String password) {
        super(name, email, contact, age, dob, address, username, password, "Admin");
        this.adminId = adminIdCounter++;
    }

    public int getAdminId() { return adminId; }
}
