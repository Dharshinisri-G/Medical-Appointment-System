package dao;

import utils.DBConnection;
import java.sql.*;

public class AppointmentDAO {
    public boolean bookAppointment(int patientId, int doctorId, String appointmentDate) {
        String checkQuery = "SELECT COUNT(*) FROM appointments WHERE doctor_id = ? AND appointment_date = ?";
        String insertQuery = "INSERT INTO appointments (patient_id, doctor_id, appointment_date) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement checkPs = conn.prepareStatement(checkQuery)) {
            checkPs.setInt(1, doctorId);
            checkPs.setString(2, appointmentDate);
            ResultSet rs = checkPs.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                System.out.println("Doctor is already booked on this date.");
                return false;
            }

            try (PreparedStatement insertPs = conn.prepareStatement(insertQuery)) {
                insertPs.setInt(1, patientId);
                insertPs.setInt(2, doctorId);
                insertPs.setString(3, appointmentDate);
                return insertPs.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
