package model;

import java.util.Date;

public class Referral {

    private String referralID;
    private Date referralDate;
    private String referredTo;
    private String reason;
    private String status;

    public Referral(String referralID, String referredTo, String reason) {
        this.referralID = referralID;
        this.referredTo = referredTo;
        this.reason = reason;
        this.status = "Pending";
        this.referralDate = new Date();
    }

    public void updateReferralStatus(String status) {
        this.status = status;
    }

    public void sendEmail() {
        System.out.println("Referral email generated for referral ID: " + referralID);
    }

    // Getters
    public String getReferralID() {
        return referralID;
    }

    public Date getReferralDate() {
        return referralDate;
    }

    public String getStatus() {
        return status;
    }
}
