package controller;

import dao.IAppointmentDAO;
import dao.AppointmentDAOImpl;
import model.Appointment;
import java.util.List;

public class AppointmentController {
    private IAppointmentDAO appointmentDAO;

    public AppointmentController() {
        this.appointmentDAO = new AppointmentDAOImpl();
    }

    public void bookAppointment(Appointment appointment) {
        appointmentDAO.addAppointment(appointment);
        System.out.println("✅ Appointment booked successfully!");
    }

    public Appointment getAppointmentById(int id) {
        return appointmentDAO.getAppointmentById(id);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }

    public boolean updateAppointment(Appointment appointment) {
        return appointmentDAO.updateAppointment(appointment);
    }

    public boolean cancelAppointment(int id) {
        return appointmentDAO.deleteAppointment(id);
    }

    // Add this method to save data
    public void saveData() {
        ((AppointmentDAOImpl) appointmentDAO).saveToFile();
    }

    // Add this method to load data
    public void loadData() {
        ((AppointmentDAOImpl) appointmentDAO).loadFromFile();
    }
}