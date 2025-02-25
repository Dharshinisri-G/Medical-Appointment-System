package com.medicalappointmentsystem.model;

public class Doctor extends User {
    private static int doctorIdCounter = 1;
    private int doctorId;
    private String specialization;
    private String hospitalId;

    public Doctor(String name, String email, String contact, int age, String dob, String address, String username, String password, String specialization, String hospitalId) {
        super(name, email, contact, age, dob, address, username, password, "Doctor");
        this.doctorId = doctorIdCounter++;
        this.specialization = specialization;
        this.hospitalId = hospitalId;
    }

    public int getDoctorId() { return doctorId; }
}
