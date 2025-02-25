package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.MedicalRecord;
import java.util.List;

public interface MedicalRecordDAO {
    void addMedicalRecord(MedicalRecord record);
    List<MedicalRecord> getMedicalRecordsByPatientId(int patientId);
}
