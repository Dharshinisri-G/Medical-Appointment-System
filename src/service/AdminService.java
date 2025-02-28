package services;

import dao.AdminDAO;
import models.Doctor;
import models.Patient;
import models.Appointment;
import java.util.List;

public class AdminService {
    private AdminDAO adminDAO = new AdminDAO();

    public void showAdminDashboard() {
        System.out.println("\n🔹 Admin Dashboard");

        // Show all doctors
        System.out.println("\n👨‍⚕️ List of Doctors:");
        List<Doctor> doctors = adminDAO.getAllDoctors();
        for (Doctor doctor : doctors) {
            System.out.println("ID: " + doctor.getId() + " | Specialization: " + doctor.getSpecialization());
        }

        // Show all patients
        System.out.println("\n🏥 List of Patients:");
        List<Patient> patients = adminDAO.getAllPatients();
        for (Patient patient : patients) {
            System.out.println("ID: " + patient.getId() + " | Age: " + patient.getAge());
        }

        // Show all appointments
        System.out.println("\n📅 List of Appointments:");
        List<Appointment> appointments = adminDAO.getAllAppointments();
        for (Appointment appointment : appointments) {
            System.out.println("Appointment ID: " + appointment.getId() + " | Patient ID: " + appointment.getPatientId() + " | Doctor ID: " + appointment.getDoctorId() + " | Date: " + appointment.getAppointmentDate());
        }
    }
}
