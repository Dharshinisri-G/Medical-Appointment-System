package services;

import dao.DoctorDAO;
import models.Doctor;
import models.Appointment;
import java.util.List;

public class DoctorService {
    private DoctorDAO doctorDAO = new DoctorDAO();

    public void showDoctorDashboard(int userId) {
        Doctor doctor = doctorDAO.getDoctorByUserId(userId);
        if (doctor == null) {
            System.out.println("Doctor details not found!");
            return;
        }

        System.out.println("\n👨‍⚕️ Doctor Dashboard");
        System.out.println("Specialization: " + doctor.getSpecialization());

        List<Appointment> appointments = doctorDAO.getDoctorAppointments(doctor.getId());
        System.out.println("Appointments:");
        for (Appointment appt : appointments) {
            System.out.println("  - Patient ID: " + appt.getPatientId() + " | Date: " + appt.getAppointmentDate());
        }
    }
}
