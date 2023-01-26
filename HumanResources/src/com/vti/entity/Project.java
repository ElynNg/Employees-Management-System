package com.vti.entity;

public class Project {
    private int id;
    private String projectName;
    private int teamSize;

    public Project() {
    }

    public Project(int id, String projectName, int teamSize) {
        this.id = id;
        this.projectName = projectName;
        this.teamSize = teamSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
