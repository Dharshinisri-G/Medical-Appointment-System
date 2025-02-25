package com.medicalappointmentsystem;

import com.medicalappointmentsystem.controller.UserController;
import com.medicalappointmentsystem.controller.DoctorController;
import com.medicalappointmentsystem.controller.PatientController;
import com.medicalappointmentsystem.controller.AppointmentController;
import com.medicalappointmentsystem.model.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        DoctorController doctorController = new DoctorController();
        PatientController patientController = new PatientController();
        AppointmentController appointmentController = new AppointmentController();

        while (true) {
            System.out.println("\n=== Medical Appointment System ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userController.registerUser();
                    break;
                case 2:
                    User user = userController.loginUser();
                    if (user != null) {
                        if (user.getRole().equalsIgnoreCase("Admin")) {
                            adminMenu(doctorController, appointmentController);
                        } else if (user.getRole().equalsIgnoreCase("Doctor")) {
                            doctorMenu(appointmentController);
                        } else if (user.getRole().equalsIgnoreCase("Patient")) {
                            patientMenu(appointmentController);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void adminMenu(DoctorController doctorController, AppointmentController appointmentController) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Admin Menu ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. View Doctors");
            System.out.println("3. Logout");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    doctorController.addDoctor();
                    break;
                case 2:
                    doctorController.listDoctors();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void doctorMenu(AppointmentController appointmentController) {
        // Implement doctor-specific actions
    }

    private static void patientMenu(AppointmentController appointmentController) {
        // Implement patient-specific actions
    }
}
