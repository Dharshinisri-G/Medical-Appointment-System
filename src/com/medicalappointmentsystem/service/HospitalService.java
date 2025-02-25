package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.HospitalDAO;
import com.medicalappointmentsystem.dao.impl.HospitalDAOImpl;
import com.medicalappointmentsystem.model.Hospital;

import java.util.List;

public class HospitalService {
    private HospitalDAO hospitalDAO = new HospitalDAOImpl();

    public void addHospital(Hospital hospital) {
        hospitalDAO.addHospital(hospital);
    }

    public List<Hospital> getAllHospitals() {
        return hospitalDAO.getAllHospitals();
    }
}
