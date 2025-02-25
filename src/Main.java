import controller.*;
import model.*;
import java.util.Scanner;

public class Main {
    private static UserController userController = new UserController();
    private static DoctorController doctorController = new DoctorController();
    private static PatientController patientController = new PatientController();
    private static AppointmentController appointmentController = new AppointmentController();

    private static Scanner scanner = new Scanner(System.in);
    private static User loggedInUser = null; // To store the currently logged-in user

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Medical Appointment System =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void registerUser() {
        System.out.println("\n--- Register User ---");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter DOB (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Role (Admin/Doctor/Patient): ");
        String role = scanner.nextLine().toLowerCase();

        User newUser = null;
        switch (role) {
            case "doctor":
                System.out.println("Enter Specialization:");
                String specialization=scanner.nextLine();
                System.out.println("Enter HospitalId:");
                int hospitalId=scanner.nextInt();
                scanner.nextLine();
                newUser = new Doctor(name, email, contact, age, dob, address, username, password,specialization,hospitalId);
                doctorController.addDoctor((Doctor) newUser);
                break;
            case "patient":
                newUser = new Patient(name, email, contact, age, dob, address, username, password);
                patientController.addPatient((Patient) newUser);
                break;
            case "admin":
                newUser = new Admin(name, email, contact, age, dob, address, username, password);
                userController.registerUser(newUser);
                break;
            default:
                System.out.println("❌ Invalid role! Registration failed.");
                return;
        }
        System.out.println("✅ Registration successful!");
    }


    private static void loginUser() {
        System.out.println("\n--- Login ---");
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        loggedInUser = userController.getUserByUsername(username);
        if (loggedInUser != null && loggedInUser.getPassword().equals(password)) {
            System.out.println("✅ Login successful! Welcome, " + loggedInUser.getName());
            userDashboard();
        } else {
            System.out.println("❌ Invalid credentials! Try again.");
            loggedInUser = null;
        }
    }

    private static void userDashboard() {
        if (loggedInUser instanceof Admin) {
            adminDashboard();
        } else if (loggedInUser instanceof Doctor) {
            doctorDashboard();
        } else if (loggedInUser instanceof Patient) {
            patientDashboard();
        }
    }

    private static void adminDashboard() {
        while (true) {
            System.out.println("\n--- Admin Dashboard ---");
            System.out.println("1. Manage Doctors");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("\nList of Doctors:");
                for (Doctor doc : doctorController.getAllDoctors()) {
                    System.out.println(doc);
                }
            } else if (choice == 2) {
                System.out.println("Logging out...");
                loggedInUser = null;
                return;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void doctorDashboard() {
        while (true) {
            System.out.println("\n--- Doctor Dashboard ---");
            System.out.println("1. View Appointments");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("\nList of Appointments:");
                for (Appointment app : appointmentController.getAllAppointments()) {
                    System.out.println(app);
                }
            } else if (choice == 2) {
                System.out.println("Logging out...");
                loggedInUser = null;
                return;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void patientDashboard() {
        while (true) {
            System.out.println("\n--- Patient Dashboard ---");
            System.out.println("1. Book Appointment");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                bookAppointment();
            } else if (choice == 2) {
                System.out.println("Logging out...");
                loggedInUser = null;
                return;
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void bookAppointment() {
        System.out.println("\n--- Book Appointment ---");
        System.out.print("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter Time (HH:MM): ");
        String time = scanner.nextLine();

        Appointment newAppointment;
        newAppointment = new Appointment(loggedInUser.getId(), doctorId, date, time);
        appointmentController.bookAppointment(newAppointment);
        System.out.println("✅ Appointment booked successfully!");
    }
}
