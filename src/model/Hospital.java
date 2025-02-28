package model;

public class Hospital {
    private static int count = 1;
    private int id;
    private String name;
    private String location;
    private String contact;

    public Hospital(String name, String location, String contact) {
        this.setId();
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public void setId() {
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }

    public void displayDetails() {
        System.out.println("Hospital ID: " + id + ", Name: " + name + ", Location: " + location);
    }
}