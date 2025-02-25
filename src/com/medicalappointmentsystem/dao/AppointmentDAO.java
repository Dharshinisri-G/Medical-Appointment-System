package com.medicalappointmentsystem.dao;

import com.medicalappointmentsystem.model.Appointment;
import java.util.List;

public interface AppointmentDAO {
    void bookAppointment(Appointment appointment);
    Appointment getAppointmentById(int appointmentId);
    List<Appointment> getAllAppointments();
    void updateAppointmentStatus(int appointmentId, String status);
}
