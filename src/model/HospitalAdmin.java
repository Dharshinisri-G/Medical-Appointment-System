package model;

import java.io.Serializable;

public class HospitalAdmin extends User implements Serializable {

    private int hospitalId;

    public HospitalAdmin(String name, String email, String contact, int age, String dob, String address, String username, String password, int hospitalId) {
        super(name, email, contact, age, dob, address, username, password);
        this.hospitalId = hospitalId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Hospital Admin ID: " + id + ", Name: " + name + ", Hospital ID: " + hospitalId);
    }
}