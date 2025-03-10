package models;

public class Doctor {
    private int DoctorId;
    private String Name;
    private int Age;
    private String Contact;
    private String Specialization;
    private int Experience;
    private int Limit;
    private String UserName;
    private String Password;

    public Doctor(String Name,int Age,String Contact,String Specialization,int Experience,int Limit,String UserName,String Password){
        this.Age=Age;
        this.Name=Name;
        this.Contact=Contact;
        this.Specialization=Specialization;
        this.Experience=Experience;
        this.Limit=Limit;
        this.UserName=UserName;
        this.Password=Password;
    }

    public int getDoctorId(){return DoctorId;}
    public String getName(){return Name;}
    public int getAge(){return Age;}
    public String getContact(){return Contact;}
    public String getSpecialization(){return Specialization;}
    public int getExperience(){return Experience;}
    public int getLimit(){return Limit;}
    public String getUserName(){return UserName;}
    public String getPassword(){return Password;}

    public void setDoctorId(int doctorId){DoctorId=doctorId;}
    public void setName(String name){Name=name;}
    public void setAge(int age){Age=age;}
    public void setContact(String contact){Contact=contact;}
    public void setSpecialization(String specialization){Specialization=specialization;}
    public void setExperience(int experience){Experience=experience;}
    public void setLimit(int limit){Limit=limit;}
    public void setUserName(String userName){UserName=userName;}
    public void setPassword(String password){Password=password;}

    public String toString(){
        return "DoctorId: "+DoctorId+" | Name: "+Name+" | Username: "+UserName+" | Age: "+Age+" | Contact: "+Contact+" | Specialization: "+Specialization+" | Experience: "+Experience;
    }
}