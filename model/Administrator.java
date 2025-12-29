package model;

public class Administrator {

    private final String adminId;
    private final String name;
    private final int age;
    private final String gender;
    private final String contact;
    private final String role;

    // Constructor
    public Administrator(String adminId, String name, int age, String gender, String contact, String role) {
        this.adminId = adminId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.role = role;
    }

    // ===== Getters =====
    public String getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContact() {
        return contact;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        // Useful for JList or table display
        return adminId + " - " + name;
    }
}
