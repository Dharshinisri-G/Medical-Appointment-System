package model;

import java.io.Serializable;

public class Admin extends User implements Serializable {

    public Admin(String name, String email, String contact, int age, String dob, String address, String username, String password) {
        super(name, email, contact, age, dob, address, username, password);
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin ID: " + id + ", Name: " + name + ", Email: " + email);
    }
}