package models;

public class Patient{
    private int PatientId;
    private String Name;
    private int Age;
    private String Contact;
    private String Gender;
    private String Address;
    private String UserName;
    private String Password;

    public Patient(String Name,int Age,String Contact,String Gender,String Address,String UserName,String Password){
        this.Name=Name;
        this.Age=Age;
        this.Contact=Contact;
        this.Gender=Gender;
        this.Address=Address;
        this.UserName=UserName;
        this.Password=Password;
    }

    public int getPatientId(){return PatientId;}
    public String getName(){return Name;}
    public int getAge(){return Age;}
    public String getContact(){return Contact;}
    public String getGender(){return Gender;}
    public String getAddress(){return Address;}
    public String getUserName(){return UserName;}
    public String getPassword(){return Password;}

    public void setPatientId(int patientId){PatientId=patientId;}
    public void setName(String name){Name=name;}
    public void setAge(int age){Age=age;}
    public void setContact(String contact){Contact=contact;}
    public void setGender(String gender){Gender=gender;}
    public void setAddress(String address){Address=address;}
    public void setUserName(String userName){UserName=userName;}
    public void setPassword(String password){Password=password;}

    public String toString(){
        return "PatientId: "+PatientId+" | Name: "+Name+" | Username: "+UserName+" | Age: "+Age+" | Contact: "+Contact+" | Gender: "+Gender+" | Address: "+Address;
    }
}