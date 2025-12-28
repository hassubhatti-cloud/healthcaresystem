package model;

/**
 * Represents a Specialist Doctor, extends Clinician.
 */
public class SpecialistDoctor extends Clinician {

    // Constructor
    public SpecialistDoctor(int clinicianId,
                            String name,
                            int age,
                            String gender,
                            String contact,
                            String title,
                            String speciality,
                            String gmcNumber) {
        super(clinicianId, name, age, gender, contact, title, speciality, gmcNumber);
    }

    /** Convenience getter for Specialist ID (same as clinicianId) */
    public int getSpecialistId() {
        return clinicianId;
    }
}
