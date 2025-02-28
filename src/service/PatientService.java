package services;

import dao.PatientDAO;
import dao.AppointmentDAO;
import models.Patient;
import models.Appointment;
import java.util.List;
import java.util.Scanner;

public class PatientService {
    private PatientDAO patientDAO = new PatientDAO();
    private AppointmentDAO appointmentDAO = new AppointmentDAO();
    private Scanner scanner = new Scanner(System.in);

    public void showPatientDashboard(int userId) {
        Patient patient = patientDAO.getPatientByUserId(userId);
        if (patient == null) {
            System.out.println("Patient details not found!");
            return;
        }

        System.out.println("\n🏥 Patient Dashboard");
        System.out.println("Age: " + patient.getAge());

        List<Appointment> appointments = patientDAO.getPatientAppointments(patient.getId());
        System.out.println("Appointments:");
        for (Appointment appt : appointments) {
            System.out.println("  - Doctor ID: " + appt.getDoctorId() + " | Date: " + appt.getAppointmentDate());
        }

        System.out.println("\n📅 Book New Appointment? (yes/no)");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            System.out.print("Enter Doctor ID: ");
            int doctorId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
            String date = scanner.nextLine();

            boolean success = appointmentDAO.bookAppointment(patient.getId(), doctorId, date);
            System.out.println(success ? "✅ Appointment booked!" : "❌ Booking failed.");
        }
    }
}
