package com.smarthire.dao;

import java.util.List;

import com.smarthire.model.Application;

public interface ApplicationDAO {

    boolean applyJob(Application application);

    List<Application> getApplicationsByUserId(int userId);
    boolean updateStatus(int applicationId, String status);

}