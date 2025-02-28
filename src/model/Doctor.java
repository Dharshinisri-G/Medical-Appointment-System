package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends User implements Serializable {
    private String specialization;
    private int hospitalId;
    private List<Integer> appointmentIds;

    public Doctor(String name, String email, String contact, int age, String dob, String address, String username, String password, String specialization, int hospitalId) {
        super(name, email, contact, age, dob, address, username, password);
        this.specialization = specialization;
        this.hospitalId = hospitalId;
        this.appointmentIds = new ArrayList<>();
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public List<Integer> getAppointmentIds() {
        return appointmentIds;
    }

    public void addAppointment(int appointmentId) {
        appointmentIds.add(appointmentId);
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization);
    }
}