package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.PrescriptionDAO;
import com.medicalappointmentsystem.dao.impl.PrescriptionDAOImpl;
import com.medicalappointmentsystem.model.Prescription;

import java.util.List;

public class PrescriptionService {
    private PrescriptionDAO prescriptionDAO = new PrescriptionDAOImpl();

    public void addPrescription(Prescription prescription) {
        prescriptionDAO.addPrescription(prescription);
    }

    public List<Prescription> getPrescriptionsByPatientId(int patientId) {
        return prescriptionDAO.getPrescriptionsByPatientId(patientId);
    }
}
