package com.medicalappointmentsystem.dao.impl;

import com.medicalappointmentsystem.dao.PatientDAO;
import com.medicalappointmentsystem.model.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
    private List<Patient> patients = new ArrayList<>();

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    @Override
    public Patient getPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patients;
    }
}
