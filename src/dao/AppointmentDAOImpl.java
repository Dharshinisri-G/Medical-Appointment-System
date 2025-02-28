package dao;

import model.Appointment;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class AppointmentDAOImpl implements IAppointmentDAO {
    private List<Appointment> appointments = new ArrayList<>();
    private static final String FILE_NAME = "appointments.txt"; // File to store appointment data

    public AppointmentDAOImpl() {
        loadFromFile(); // Load data from file when the DAO is initialized
    }

    @Override
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        saveToFile(); // Save data to file after adding an appointment
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
                saveToFile(); // Save data to file after updating an appointment
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAppointment(int id) {
        boolean removed = appointments.removeIf(appointment -> appointment.getId() == id);
        if (removed) saveToFile(); // Save data to file after deleting an appointment
        return removed;
    }

    // Save the list of appointments to a file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(appointments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the list of appointments from a file
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                appointments = (List<Appointment>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No existing data file found. Starting with an empty list.");
        }
    }
}