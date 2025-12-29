package model;

import java.util.List;
import java.util.ArrayList;

public class Patient {

    private String patientID;
    private String name;
    private String contact;
    private String age;
    private String gender;
    private List<PatientRecord> medicalHistory;

    // ===== Constructor =====
    public Patient(String patientID, String name, String contact,
                   String age, String gender) {
        this.patientID = patientID;
        this.name = name;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
        this.medicalHistory = new ArrayList<>();
    }

    // ===== Getters =====
    public String getPatientID() { return patientID; }
    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getAge() { return age; }
    public String getGender() { return gender; }
    public List<PatientRecord> getMedicalHistory() { return medicalHistory; }

    // ===== Add record =====
    public void addMedicalRecord(PatientRecord record) {
        medicalHistory.add(record);
    }
}
