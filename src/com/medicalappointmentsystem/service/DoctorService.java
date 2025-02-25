package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.DoctorDAO;
import com.medicalappointmentsystem.dao.impl.DoctorDAOImpl;
import com.medicalappointmentsystem.model.Doctor;

import java.util.List;

public class DoctorService {
    private DoctorDAO doctorDAO = new DoctorDAOImpl();

    public void addDoctor(Doctor doctor) {
        doctorDAO.addDoctor(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAllDoctors();
    }
}
