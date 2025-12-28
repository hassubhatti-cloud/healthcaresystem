package model;

/**
 * Represents a Nurse, extends Clinician.
 */
public class Nurse extends Clinician {

    private String shift;
    private String roles;

    // Constructor
    public Nurse(int clinicianId,
                 String name,
                 int age,
                 String gender,
                 String contact,
                 String title,
                 String speciality,
                 String gmcNumber,
                 String shift,
                 String roles) {
        super(clinicianId, name, age, gender, contact, title, speciality, gmcNumber);
        this.shift = shift;
        this.roles = roles;
    }

    /** Convenience getter for Nurse ID (same as clinicianId) */
    public int getNurseId() {
        return clinicianId;
    }

    // ===== Additional Getters & Setters =====
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
