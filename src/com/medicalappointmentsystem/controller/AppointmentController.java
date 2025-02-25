package com.medicalappointmentsystem.controller;

import com.medicalappointmentsystem.dao.AppointmentDAO;
import com.medicalappointmentsystem.dao.impl.AppointmentDAOImpl;
import com.medicalappointmentsystem.model.Appointment;
import java.util.Scanner;

public class AppointmentController {
    private AppointmentDAO appointmentDAO = new AppointmentDAOImpl();
    private Scanner scanner = new Scanner(System.in);

    public void bookAppointment() {
        System.out.println("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        System.out.println("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Date (DD/MM/YYYY): ");
        String date = scanner.nextLine();
        System.out.println("Enter Time (HH:MM): ");
        String time = scanner.nextLine();

        Appointment appointment = new Appointment(patientId, doctorId, date, time, "Scheduled");
        appointmentDAO.bookAppointment(appointment);
        System.out.println("Appointment Booked Successfully!");
    }

    public void updateAppointmentStatus() {
        System.out.println("Enter Appointment ID: ");
        int appointmentId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter New Status (Completed / Cancelled / Rescheduled): ");
        String status = scanner.nextLine();

        appointmentDAO.updateAppointmentStatus(appointmentId, status);
        System.out.println("Appointment Status Updated!");
    }
}
