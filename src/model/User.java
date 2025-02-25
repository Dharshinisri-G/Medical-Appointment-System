package model;

public abstract class User {
    private static int count=1;
    protected int id;
    protected String name;
    protected String email;
    protected String contact;
    protected int age;
    protected String dob;
    protected String address;
    protected String username;
    protected String password;

    public User( String name, String email, String contact, int age, String dob, String address, String username, String password) {
        this.setId();
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.username = username;
        this.password = password;
    }
    public void setId(){this.id=count++;}
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getContact() { return contact; }
    public int getAge() { return age; }
    public String getDob() { return dob; }
    public String getAddress() { return address; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public abstract void displayDetails();
}
