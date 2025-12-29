package model;

import java.sql.Date;
import java.sql.Time;

public class PatientRecord {

    private String recordID;
    private Date diagnosis;
    private Time notes;
    private Date visitDate;
    private String allergies;

    // ===== Constructor =====
    public PatientRecord(String recordID, Date diagnosis, Time notes, Date visitDate, String allergies) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.notes = notes;
        this.visitDate = visitDate;
        this.allergies = allergies;
    }

    // ===== Getters =====
    public String getRecordID() { return recordID; }
    public Date getDiagnosis() { return diagnosis; }
    public Time getNotes() { return notes; }
    public Date getVisitDate() { return visitDate; }
    public String getAllergies() { return allergies; }
}
