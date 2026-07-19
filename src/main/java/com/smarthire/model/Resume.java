package com.smarthire.model;

public class Resume {

    private int resumeId;
    private int userId;
    private String resumeFile;
    private String skills;

    public Resume() {
    }

    public Resume(int userId, String resumeFile, String skills) {
        this.userId = userId;
        this.resumeFile = resumeFile;
        this.skills = skills;
    }

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getResumeFile() {
        return resumeFile;
    }

    public void setResumeFile(String resumeFile) {
        this.resumeFile = resumeFile;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}