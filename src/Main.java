
import dao.UserDAO;
import models.User;
import services.DoctorService;
import services.PatientService;
import services.AdminService;
import utils.DBConnection;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Connection conn = DBConnection.getConnection();
//        if (conn != null) {
//            System.out.println("✅ Database connected successfully!");
//        }
        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();
        DoctorService doctorService = new DoctorService();
        PatientService patientService = new PatientService();
        AdminService adminService = new AdminService();

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        User user = userDAO.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            switch (user.getRole()) {
                case "doctor" -> doctorService.showDoctorDashboard(user.getId());
                case "patient" -> patientService.showPatientDashboard(user.getId());
                case "admin" -> adminService.showAdminDashboard();
                default -> System.out.println("Invalid role detected.");
            }
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}
