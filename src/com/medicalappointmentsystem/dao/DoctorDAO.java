package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.Doctor;
import java.util.List;

public interface DoctorDAO {
    void addDoctor(Doctor doctor);
    Doctor getDoctorById(int doctorId);
    List<Doctor> getAllDoctors();
    void removeDoctor(int doctorId);
}
