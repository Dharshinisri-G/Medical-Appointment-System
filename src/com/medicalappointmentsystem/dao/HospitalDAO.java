package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.Hospital;
import java.util.List;

public interface HospitalDAO {
    void addHospital(Hospital hospital);
    Hospital getHospitalById(int hospitalId);
    List<Hospital> getAllHospitals();
}
