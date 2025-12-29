package model;

/**
 * Represents a General Practitioner (GP), extends Clinician.
 */
public class GeneralPractitioner extends Clinician {

    // Constructor
    public GeneralPractitioner(int clinicianId,
                               String name,
                               int age,
                               String gender,
                               String contact,
                               String title,
                               String speciality,
                               String gmcNumber) {
        super(clinicianId, name, age, gender, contact, title, speciality, gmcNumber);
    }

    /** Convenience getter for GP ID (same as clinicianId) */
    public int getGpId() {
        return clinicianId;
    }
}
