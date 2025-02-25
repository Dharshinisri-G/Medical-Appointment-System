package com.medicalappointmentsystem.service;

import com.medicalappointmentsystem.dao.AppointmentDAO;
import com.medicalappointmentsystem.dao.impl.AppointmentDAOImpl;
import com.medicalappointmentsystem.model.Appointment;

import java.util.List;

public class AppointmentService {
    private AppointmentDAO appointmentDAO = new AppointmentDAOImpl();

    public void bookAppointment(Appointment appointment) {
        appointmentDAO.bookAppointment(appointment);
    }

    public void updateAppointmentStatus(int appointmentId, String status) {
        appointmentDAO.updateAppointmentStatus(appointmentId, status);
    }

    public List<Appointment> getAppointmentsByDoctorId(int doctorId) {
        return appointmentDAO.getAppointmentsByDoctorId(doctorId);
    }

    public List<Appointment> getAppointmentsByPatientId(int patientId) {
        return appointmentDAO.getAppointmentsByPatientId(patientId);
    }
}
