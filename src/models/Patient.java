package models;

public class Patient {
    private int id;
    private int userId;
    private int age;

    public Patient(int id, int userId, int age) {
        this.id = id;
        this.userId = userId;
        this.age = age;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public int getAge() { return age; }
}
