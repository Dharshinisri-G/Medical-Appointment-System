package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.Patient;
import java.util.List;

public interface PatientDAO {
    void addPatient(Patient patient);
    Patient getPatientById(int patientId);
    List<Patient> getAllPatients();
}
