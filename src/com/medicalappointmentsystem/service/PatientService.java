package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.PatientDAO;
import com.medicalappointmentsystem.dao.impl.PatientDAOImpl;
import com.medicalappointmentsystem.model.Patient;

import java.util.List;

public class PatientService {
    private PatientDAO patientDAO = new PatientDAOImpl();

    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
    }

    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }
}
