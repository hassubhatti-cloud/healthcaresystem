package model;

public abstract class Clinician {


    protected int clinicianId;
    protected String name;
    protected int age;
    protected String gender;
    protected String contact;
    protected String title;
    protected String speciality;
    protected String gmcNumber;

    // ===== CONSTRUCTOR =====
    public Clinician(int clinicianId,
                     String name,
                     int age,
                     String gender,
                     String contact,
                     String title,
                     String speciality,
                     String gmcNumber) {

        this.clinicianId = clinicianId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.title = title;
        this.speciality = speciality;
        this.gmcNumber = gmcNumber;
    }

    // ===== GETTERS  =====
    public int getClinicianId() {
        return clinicianId;
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

    public String getTitle() {
        return title;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGmcNumber() {
        return gmcNumber;
    }
}
