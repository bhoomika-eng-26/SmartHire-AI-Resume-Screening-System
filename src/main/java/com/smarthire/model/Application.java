package com.smarthire.model;

public class Application {

    private int applicationId;
    private int userId;
    private int jobId;
    private String status;
    
    // Job details
    private String title;
    private String company;
    private String requiredSkills;
    private String salary;

    // Resume skills
    private String resumeSkills;

    // AI Match Percentage
    private double matchPercentage;

    // AI Skill Analysis
    private String matchedSkills;
    private String missingSkills;
    
    // Recruiter Dashboard - Candidate Details
    private String candidateName;
    private String email;
    private String phone;
    private String skills;
    private double cgpa;


    public Application() {
    }


    public Application(int userId, int jobId, String status) {
        this.userId = userId;
        this.jobId = jobId;
        this.status = status;
    }



    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }



    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



    public String getResumeSkills() {
        return resumeSkills;
    }

    public void setResumeSkills(String resumeSkills) {
        this.resumeSkills = resumeSkills;
    }



    public double getMatchPercentage() {
        return matchPercentage;
    }

    public void setMatchPercentage(double matchPercentage) {
        this.matchPercentage = matchPercentage;
    }



    // AI Skill Analysis Getters and Setters


    public String getMatchedSkills() {
        return matchedSkills;
    }


    public void setMatchedSkills(String matchedSkills) {
        this.matchedSkills = matchedSkills;
    }



    public String getMissingSkills() {
        return missingSkills;
    }


    public void setMissingSkills(String missingSkills) {
        this.missingSkills = missingSkills;
    }




    // Recruiter Dashboard Getters and Setters


    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }



    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

}