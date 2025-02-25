package com.medicalappointmentsystem.dao.impl;

import com.medicalappointmentsystem.dao.AppointmentDAO;
import com.medicalappointmentsystem.model.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements AppointmentDAO {
    private List<Appointment> appointments = new ArrayList<>();

    @Override
    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public Appointment getAppointmentById(int appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appointmentId) {
                return appointment;
            }
        }
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    @Override
    public void updateAppointmentStatus(int appointmentId, String status) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appointmentId) {
                appointment.setStatus(status);
                return;
            }
        }
    }
}
