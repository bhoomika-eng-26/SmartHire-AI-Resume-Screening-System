package com.smarthire.model;

public class Job {

    private int jobId;
    private String title;
    private String company;
    private String requiredSkills;
    private String salary;

    public Job() {
    }

    public Job(int jobId, String title, String company,
               String requiredSkills, String salary) {
        this.jobId = jobId;
        this.title = title;
        this.company = company;
        this.requiredSkills = requiredSkills;
        this.salary = salary;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
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
}