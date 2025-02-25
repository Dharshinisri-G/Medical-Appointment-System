package dao;

import model.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAOImpl implements IAppointmentDAO {
    private List<Appointment> appointments = new ArrayList<>();

    @Override
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public Appointment getAppointmentById(int id) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == id) return appointment;
        }
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    @Override
    public boolean updateAppointment(Appointment updatedAppointment) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == updatedAppointment.getId()) {
                appointments.set(appointments.indexOf(appointment), updatedAppointment);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAppointment(int id) {
        return appointments.removeIf(appointment -> appointment.getId() == id);
    }
}
