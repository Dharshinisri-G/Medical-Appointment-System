package models;

public class Admin {
    private int AdminId;
    private String Name;
    private String UserName;
    private String Password;

    public Admin(String Name,String UserName,String Password){
        this.Name=Name;
        this.UserName=UserName;
        this.Password=Password;
    }
    public int getAdminId(){return AdminId;}
    public String getName(){return Name;}
    public String getUserName(){return UserName;}
    public String getPassword(){return Password;}

    public void setAdminId(int adminId){AdminId=adminId;}
    public void setName(String name){Name=name;}
    public void setUserName(String userName){UserName=userName;}
    public void setPassword(String password){Password=password;}
    
    public String toString() {
        return "AdminId: "+AdminId+" | Name: "+Name+" | UserName: "+UserName;
    }
}
