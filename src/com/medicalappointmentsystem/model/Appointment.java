package com.medicalappointmentsystem.model;

import java.time.LocalDateTime;

public class Appointment {
    private static int appointmentIdCounter = 1;
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private int hospitalId;
    private LocalDateTime appointmentDate;
    private String status;

    public Appointment(int patientId, int doctorId, int hospitalId, LocalDateTime appointmentDate) {
        this.appointmentId = appointmentIdCounter++;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.hospitalId = hospitalId;
        this.appointmentDate = appointmentDate;
        this.status = "Scheduled";
    }
}
