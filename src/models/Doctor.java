package models;

public class Doctor {
    private int id;
    private int userId;
    private String specialization;

    public Doctor(int id, int userId, String specialization) {
        this.id = id;
        this.userId = userId;
        this.specialization = specialization;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getSpecialization() { return specialization; }
}
