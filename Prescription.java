package model;
import java.util.Date;
public class Prescription {

    private String prescriptionID;
    private String medicine;
    private String dosage;
    private Date IssueDate;
    private String instructions;

    // Constructor
    public Prescription(String prescriptionID,
                        String medicine,
                        String dosage,
                        Date IssueDate,
                        String instructions) {

        this.prescriptionID = prescriptionID;
        this.medicine = medicine;
        this.dosage = dosage;
        this.IssueDate = IssueDate;
        this.instructions = instructions;
    }

    // ===== Getters =====
    public String getPrescriptionID() { return prescriptionID; }
    public String getMedicine() { return medicine; }
    public String getDosage() { return dosage; }
    public Date getIssueDate() { return IssueDate; }
    public String getInstructions() { return instructions; }

    // ===== Setters=====
    public void setMedicine(String medicine) { this.medicine = medicine; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    public void setIssueDate(Date IssueDate) { this.IssueDate = IssueDate; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
}
