package model;

import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private static int count=1;
    private List<Integer> appointmentIds;
    private List<Integer> medicalRecordIds;

    public Patient(String name, String email, String contact, int age, String dob, String address, String username, String password) {
        super( name, email, contact, age, dob, address, username, password);
        this.appointmentIds = new ArrayList<>();
        this.medicalRecordIds = new ArrayList<>();
    }

    public List<Integer> getAppointmentIds() { return appointmentIds; }
    public List<Integer> getMedicalRecordIds() { return medicalRecordIds; }

    public void addAppointment(int appointmentId) {
        appointmentIds.add(appointmentId);
    }

    public void addMedicalRecord(int recordId) {
        medicalRecordIds.add(recordId);
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + id + ", Name: " + name);
    }
}
