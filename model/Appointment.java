package model;

import java.util.Date;
import java.sql.Time;

public class Appointment {

    private String appointmentId;
    private String patientId;
    private String clinicianId;
    private Date date;
    private Time time;
    private String status;
    private boolean assignedToGP;
    private String referredToSpecialistId;
    private String prescription;

    //  Constructor
    public Appointment(String appointmentId,
                       String patientId,
                       String clinicianId,
                       Date date,
                       Time time,
                       String status,
                       boolean assignedToGP) {

        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.clinicianId = clinicianId;
        this.date = date;
        this.time = time;
        this.status = status;
        this.assignedToGP = assignedToGP;
        this.referredToSpecialistId = null;
        this.prescription = null;
    }

    // ===== Getters =====
    public String getAppointmentId() { return appointmentId; }
    public String getPatientId() { return patientId; }
    public String getClinicianId() { return clinicianId; }
    public Date getDate() { return date; }
    public Time getTime() { return time; }
    public String getStatus() { return status; }
    public boolean getAssignedToGP() { return assignedToGP; }
    public String getReferredToSpecialistId() { return referredToSpecialistId; }
    public String getPrescription() { return prescription; }

    // ===== Setters =====
    public void setClinicianId(String clinicianId) { this.clinicianId = clinicianId; }
    public void setDate(Date date) { this.date = date; }
    public void setTime(Time time) { this.time = time; }
    public void setStatus(String status) { this.status = status; }
    public void setAssignedToGP(boolean assignedToGP) { this.assignedToGP = assignedToGP; }
    public void setReferredToSpecialistId(String specialistId) {
        this.referredToSpecialistId = specialistId;
    }
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
