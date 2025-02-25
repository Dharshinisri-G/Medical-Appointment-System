package com.medicalappointmentsystem.model;

public class Patient extends User {
    private static int patientIdCounter = 1;
    private int patientId;

    public Patient(String name, String email, String contact, int age, String dob, String address, String username, String password) {
        super(name, email, contact, age, dob, address, username, password, "Patient");
        this.patientId = patientIdCounter++;
    }

    public int getPatientId() { return patientId; }
}
