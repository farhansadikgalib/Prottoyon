package com.farhan.prottoyon.Model;

public class ItemModel {

    private String applicantName;
    private String legacy;
    private String applicantDate;
    private String applicantID;


    public ItemModel(String applicantName, String legacy, String applicantDate, String applicantID) {
        this.applicantName = applicantName;
        this.legacy = legacy;
        this.applicantDate = applicantDate;
        this.applicantID = applicantID;
    }


    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public String getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(String applicantDate) {
        this.applicantDate = applicantDate;
    }

    public String getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(String applicantID) {
        this.applicantID = applicantID;
    }
}
