package com.medicalappointmentsystem.model;

public class Prescription {
    private static int prescriptionIdCounter = 1;
    private int prescriptionId;
    private int patientId;
    private int doctorId;
    private String medicineDetails;

    public Prescription(int patientId, int doctorId, String medicineDetails) {
        this.prescriptionId = prescriptionIdCounter++;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medicineDetails = medicineDetails;
    }
}
