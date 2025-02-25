package com.medicalappointmentsystem.controller;

import com.medicalappointmentsystem.dao.PatientDAO;
import com.medicalappointmentsystem.dao.impl.PatientDAOImpl;
import com.medicalappointmentsystem.model.Patient;
import java.util.Scanner;

public class PatientController {
    private PatientDAO patientDAO = new PatientDAOImpl();
    private Scanner scanner = new Scanner(System.in);

    public void addPatient() {
        System.out.println("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Patient patient = new Patient(name, age);
        patientDAO.addPatient(patient);
        System.out.println("Patient Registered Successfully!");
    }

    public void listPatients() {
        for (Patient patient : patientDAO.getAllPatients()) {
            System.out.println(patient);
        }
    }
}
