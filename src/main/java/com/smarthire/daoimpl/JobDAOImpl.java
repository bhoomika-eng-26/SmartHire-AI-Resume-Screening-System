package com.smarthire.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smarthire.dao.JobDAO;
import com.smarthire.dbutil.DBConnection;
import com.smarthire.model.Job;

public class JobDAOImpl implements JobDAO {

    Connection connection = DBConnection.getConnection();

    @Override
    public List<Job> getAllJobs() {

        List<Job> jobs = new ArrayList<>();

        try {

            String sql = "SELECT * FROM jobs";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Job job = new Job();

                job.setJobId(rs.getInt("job_id"));
                job.setTitle(rs.getString("title"));
                job.setCompany(rs.getString("company"));
                job.setRequiredSkills(rs.getString("required_skills"));
                job.setSalary(rs.getString("salary"));

                jobs.add(job);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return jobs;
    }

    @Override
    public Job getJobById(int jobId) {

        Job job = null;

        try {

            String sql =
            "SELECT * FROM jobs WHERE job_id=?";

            PreparedStatement ps =
            connection.prepareStatement(sql);

            ps.setInt(1, jobId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                job = new Job();

                job.setJobId(rs.getInt("job_id"));
                job.setTitle(rs.getString("title"));
                job.setCompany(rs.getString("company"));
                job.setRequiredSkills(rs.getString("required_skills"));
                job.setSalary(rs.getString("salary"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return job;
    }
}