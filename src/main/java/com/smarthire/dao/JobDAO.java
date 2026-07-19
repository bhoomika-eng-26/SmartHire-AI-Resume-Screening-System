package com.smarthire.dao;

import java.util.List;
import com.smarthire.model.Job;

public interface JobDAO {

    List<Job> getAllJobs();

    Job getJobById(int jobId);

}