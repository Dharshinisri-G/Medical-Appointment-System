package controller;
import java.util.*;
import dao.AppointmentDAO;
import models.Appointment;

public class AppointmentController {
    AppointmentDAO appointmentDAO=new AppointmentDAO();
    public int addAppointment(int doctorId,int patientId,Date date){
        Appointment appointment=new Appointment(doctorId,patientId,date);
        return AppointmentDAO.addAppointment(appointment);
    }
    public List<Appointment> viewAppointments(){
        return appointmentDAO.viewAppointments();
    }
    public List<Appointment> viewAppointmentsWithDoctor(int doctorId){
        return appointmentDAO.viewAppointmentsWithDoctor();
    }
    public List<Appointment> viewAppointmentsWithPatient(int patientId){
        return appointmentDAO.viewAppointmentsWithPatient();
    }
    }
