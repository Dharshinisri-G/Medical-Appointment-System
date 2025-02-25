package com.medicalappointmentsystem.dao.impl;

import com.medicalappointmentsystem.dao.HospitalDAO;
import com.medicalappointmentsystem.model.Hospital;
import java.util.ArrayList;
import java.util.List;

public class HospitalDAOImpl implements HospitalDAO {
    private List<Hospital> hospitals = new ArrayList<>();

    @Override
    public void addHospital(Hospital hospital) {
        hospitals.add(hospital);
    }

    @Override
    public Hospital getHospitalById(int hospitalId) {
        for (Hospital hospital : hospitals) {
            if (hospital.getHospitalId() == hospitalId) {
                return hospital;
            }
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitals;
    }
}
