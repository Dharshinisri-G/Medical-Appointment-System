package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.MedicalRecordDAO;
import com.medicalappointmentsystem.dao.impl.MedicalRecordDAOImpl;
import com.medicalappointmentsystem.model.MedicalRecord;

import java.util.List;

public class MedicalRecordService {
    private MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAOImpl();

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordDAO.addMedicalRecord(medicalRecord);
    }

    public List<MedicalRecord> getMedicalRecordsByPatientId(int patientId) {
        return medicalRecordDAO.getMedicalRecordsByPatientId(patientId);
    }
}
