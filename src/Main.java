import controller.AdminController;
import models.Admin;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        AdminController ac=new AdminController();
        while(true){
            System.out.println("==========Welcome to the Medical Appointment System==========");
            System.out.println(" 1.Register \n 2.Login \n 3.Exit");
            System.out.print("Enter your choice: ");
            int choice=x.nextInt();
            x.nextLine();
            switch(choice){

                case 1:
                    System.out.println(" 1.Admin \n 2.Doctor \n 3.Patient");
                    System.out.print("Enter Your Role: ");
                    int role=x.nextInt();
                    switch (role){
                        case 1:
                            System.out.print("Enter AdminId: ");
                            int adminid=x.nextInt();
                            x.nextLine();
                            System.out.print("Enter Name: ");
                            String name=x.nextLine();
                            System.out.print("Enter UserName: ");
                            String username=x.nextLine();
                            System.out.print("Enter Password: ");
                            String password=x.nextLine();
                            System.out.println("Registering Admin");
                            ac.addadmin(name,username,password);
                            //System.out.println("You are now Logged In as an Admin.");
                            break;
                        case 2:
                            System.out.print("Enter DoctorId: ");
                            int doctorid=x.nextInt();
                            x.nextLine();
                            System.out.print("Enter Name: ");
                            String d_name=x.nextLine();
                            System.out.print("Enter Age: ");
                            int age=x.nextInt();
                            x.nextLine();
                            System.out.print("Enter Contact: ");
                            String contact=x.nextLine();
                            System.out.print("Enter Specialization: ");
                            String specialization=x.nextLine();
                            System.out.print("Enter Experience: ");
                            int experience=x.nextInt();
                            x.nextLine();
                            System.out.println("Registering Doctor");
                            //System.out.println("You are now Logged In as a Doctor.");
                            break;
                        case 3:
                            System.out.print("Enter PatientId: ");
                            int patientid=x.nextInt();
                            x.nextLine();
                            System.out.print("Enter Name: ");
                            String p_name=x.nextLine();
                            System.out.print("Enter Age: ");
                            int p_age=x.nextInt();
                            x.nextLine();
                            System.out.print("Enter Contact: ");
                            String p_contact=x.nextLine();
                            System.out.print("Enter Gender: ");
                            String gender=x.nextLine();
                            System.out.print("Enter Address: ");
                            String address=x.nextLine();
                            System.out.println("Registering Patient");
                            //System.out.println("You are now Logged In as a Patient.");
                            break;
                        default:
                            System.out.println("Invalid Role");
                    }
                    break;
                case 2:
                    System.out.println(" 1.Admin \n 2.Doctor \n 3.Patient");
                    System.out.print("Enter Your Role: ");
                    role=x.nextInt();
                    x.nextLine();
                    System.out.print("Enter Username: ");
                    String username=x.nextLine();
                    System.out.print("Enter Password: ");
                    String password=x.nextLine();
                    switch (role){
                    case 1:
                        System.out.println("Checking if the Admin is registered already.");
                        System.out.println("You are now Logged In as an Admin.");
                        while(true) {
                            System.out.println("Operations to perform \n 1.ViewDoctors \n 2.ViewPatients \n 3.ViewAppointments \n 4.LogOut");
                            System.out.print("Enter your Choice: ");
                            int a_choice = x.nextInt();
                            x.nextLine();
                            if (a_choice == 4) {
                                System.out.println("Logging Out......");
                                break;
                            }
                            switch (a_choice) {
                                case 1:
                                    System.out.println("View all Doctors");
                                    break;
                                case 2:
                                    System.out.println("View all Patients");
                                    break;
                                case 3:
                                    System.out.println("View all Appointments");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Checking if the Doctor is registered already.");
                        System.out.println("You are now Logged In as a Doctor.");
                        while(true){
                            System.out.println("Operations to perform \n 1.ViewMyDetail \n 2.ViewAppointments \n 3.LogOut");
                            System.out.print("Enter your Choice: ");
                            int d_choice=x.nextInt();
                            x.nextLine();
                            if(d_choice==3) {
                                System.out.println("Logging Out.....");
                                break;
                            }
                            switch(d_choice){
                                case 1:
                                    System.out.println("Your Detail");
                                    break;
                                case 2:
                                    System.out.println("View all Appointments.");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Checking if the Patient is registered already.");
                        System.out.println("You are now Logged In as a Patient.");
                        while(true) {
                            System.out.println("Operations to perform \n 1.ViewMyDetail \n 2.BookAppointment \n 3.ViewAppointments \n 4.LogOut");
                            System.out.print("Enter your Choice: ");
                            int p_choice = x.nextInt();
                            x.nextLine();
                            if (p_choice == 4) {
                                System.out.println("Logging Out......");
                                break;
                            }
                            switch (p_choice) {
                                case 1:
                                    System.out.println("Your Detail");
                                    break;
                                case 2:
                                    System.out.println("Book Appointment");
                                    System.out.println("View All doctors details");
                                    System.out.print("Enter DoctorId:");
                                    int a_doctorId = x.nextInt();
                                    x.nextLine();
                                    System.out.print("Enter date: ");
                                    String date = x.nextLine();
                                    System.out.print("Enter Time: ");
                                    String time = x.nextLine();
                                    System.out.println("Appointment Booked Successfully.");
                                    break;
                                case 3:
                                    System.out.println("View Booked Appointment");
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Role");
                }
                break;
                case 3:
                    System.out.println("Exiting from the System......");
                    return;
                default:
                   System.out.println("Invalid Choice")
                   ;
            }
        }
    }
}