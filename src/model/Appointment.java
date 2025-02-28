package model;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Appointment implements Serializable {

    private int id;
    private int patientId;
    private int doctorId;
    private int hospitalId;
    private LocalDateTime dateTime;
    private String status;

    public Appointment(int patientId, int doctorId, int hospitalId, LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.hospitalId = hospitalId;
        this.dateTime = dateTime;
        this.status = "Scheduled";
    }

    public Appointment(int patientId, int doctorId, String date, String time) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = LocalDateTime.parse(date + "T" + time); // Parse combined date-time
        this.status = "Scheduled";
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void displayDetails() {
        System.out.println("Appointment ID: " + id + ", Patient ID: " + patientId + ", Doctor ID: " + doctorId + ", Date: " + dateTime);
    }
}