package com.vti.entity;

import java.util.List;

public class ProjectAndAccount {
    private int projectID;
    private List AccountID;

    public ProjectAndAccount() {
    }

    public ProjectAndAccount(int projectID, List accountID) {
        this.projectID = projectID;
        AccountID = accountID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public List getAccountID() {
        return AccountID;
    }

    public void setAccountID(List accountID) {
        AccountID = accountID;
    }
}
