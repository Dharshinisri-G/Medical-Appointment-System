package com.medicalappointmentsystem.controller;

import com.medicalappointmentsystem.dao.DoctorDAO;
import com.medicalappointmentsystem.dao.impl.DoctorDAOImpl;
import com.medicalappointmentsystem.model.Doctor;
import java.util.Scanner;

public class DoctorController {
    private DoctorDAO doctorDAO = new DoctorDAOImpl();
    private Scanner scanner = new Scanner(System.in);

    public void addDoctor() {
        System.out.println("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(name, specialization);
        doctorDAO.addDoctor(doctor);
        System.out.println("Doctor Added Successfully!");
    }

    public void listDoctors() {
        for (Doctor doctor : doctorDAO.getAllDoctors()) {
            System.out.println(doctor);
        }
    }
}
