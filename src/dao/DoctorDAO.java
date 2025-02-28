package dao;

import models.Doctor;
import models.Appointment;
import utils.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {
    public Doctor getDoctorByUserId(int userId) {
        String query = "SELECT * FROM doctors WHERE user_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Doctor(rs.getInt("id"), rs.getInt("user_id"), rs.getString("specialization"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Appointment> getDoctorAppointments(int doctorId) {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT * FROM appointments WHERE doctor_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, doctorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                appointments.add(new Appointment(rs.getInt("id"), rs.getInt("patient_id"), doctorId, rs.getDate("appointment_date")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }
}
