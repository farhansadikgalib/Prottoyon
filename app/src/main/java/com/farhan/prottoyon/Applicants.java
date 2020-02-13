package com.farhan.prottoyon;

import android.content.Context;

import java.util.ArrayList;

public class Applicants {

    private String name;
    private String date;
    private String legacy;
    private String applicantsID;



    public Applicants(String name, String date, String legacy, String applicantsID) {
        this.name = name;
        this.date = date;
        this.legacy = legacy;
        this.applicantsID = applicantsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public String getApplicantsID() {
        return applicantsID;
    }

    public void setApplicantsID(String applicantsID) {
        this.applicantsID = applicantsID;
    }
}
