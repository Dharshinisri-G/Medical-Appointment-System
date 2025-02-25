package com.medicalappointmentsystem.dao.impl;

import com.medicalappointmentsystem.dao.DoctorDAO;
import com.medicalappointmentsystem.model.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAOImpl implements DoctorDAO {
    private List<Doctor> doctors = new ArrayList<>();

    @Override
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    @Override
    public void removeDoctor(int doctorId) {
        doctors.removeIf(doctor -> doctor.getDoctorId() == doctorId);
    }
}
