package dao;

import models.Patient;
import models.Appointment;
import utils.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    public Patient getPatientByUserId(int userId) {
        String query = "SELECT * FROM patients WHERE user_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Patient(rs.getInt("id"), rs.getInt("user_id"), rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Appointment> getPatientAppointments(int patientId) {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT * FROM appointments WHERE patient_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, patientId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                appointments.add(new Appointment(rs.getInt("id"), patientId, rs.getInt("doctor_id"), rs.getDate("appointment_date")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }
}
