package com.medicalappointmentsystem.model;

public class MedicalRecord {
    private static int recordIdCounter = 1;
    private int recordId;
    private int patientId;
    private int doctorId;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(int patientId, int doctorId, String diagnosis, String treatment) {
        this.recordId = recordIdCounter++;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }
}
