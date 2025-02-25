package com.medicalappointmentsystem.model;

public class Hospital {
    private static int hospitalIdCounter = 1;
    private int hospitalId;
    private String hospitalName;
    private String location;
    private String contact;

    public Hospital(String hospitalName, String location, String contact) {
        this.hospitalId = hospitalIdCounter++;
        this.hospitalName = hospitalName;
        this.location = location;
        this.contact = contact;
    }
}
