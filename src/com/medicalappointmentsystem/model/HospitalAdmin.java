package com.medicalappointmentsystem.model;

public class HospitalAdmin extends User {
    private static int hospitalAdminIdCounter = 1;
    private int hospitalAdminId;
    private String hospitalId;

    public HospitalAdmin(String name, String email, String contact, int age, String dob, String address, String username, String password, String hospitalId) {
        super(name, email, contact, age, dob, address, username, password, "HospitalAdmin");
        this.hospitalAdminId = hospitalAdminIdCounter++;
        this.hospitalId = hospitalId;
    }
}
