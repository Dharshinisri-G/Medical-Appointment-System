package dao;

import model.Appointment;
import java.util.List;

public interface IAppointmentDAO {
    void addAppointment(Appointment appointment);
    Appointment getAppointmentById(int id);
    List<Appointment> getAllAppointments();
    boolean updateAppointment(Appointment appointment);
    boolean deleteAppointment(int id);
}