package com.smarthire.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smarthire.dao.ApplicationDAO;
import com.smarthire.dbutil.DBConnection;
import com.smarthire.model.Application;

public class ApplicationDAOImpl implements ApplicationDAO {

    Connection connection = DBConnection.getConnection();

    @Override
    public boolean applyJob(Application application) {

        boolean status = false;

        try {

            String sql =
            "INSERT INTO applications(user_id, job_id, status, match_percentage, matched_skills, missing_skills) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setInt(1, application.getUserId());
            ps.setInt(2, application.getJobId());
            ps.setString(3, application.getStatus());
            ps.setDouble(4, application.getMatchPercentage());
            ps.setString(5, application.getMatchedSkills());
            ps.setString(6, application.getMissingSkills());

            int result = ps.executeUpdate();

            if(result > 0) {
                status = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return status;
    }



    @Override
    public List<Application> getApplicationsByUserId(int userId) {

        List<Application> applications = new ArrayList<>();

        try {

            String sql =
            "SELECT a.application_id,"
            + "a.user_id,"
            + "a.job_id,"
            + "a.status,"
            + "a.match_percentage,"
            + "a.matched_skills,"
            + "a.missing_skills,"
            + "j.title,"
            + "j.company,"
            + "j.required_skills,"
            + "j.salary "
            + "FROM applications a "
            + "JOIN jobs j "
            + "ON a.job_id = j.job_id "
            + "WHERE a.user_id=?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Application application = new Application();

                application.setApplicationId(rs.getInt("application_id"));
                application.setUserId(rs.getInt("user_id"));
                application.setJobId(rs.getInt("job_id"));
                application.setStatus(rs.getString("status"));

                application.setTitle(rs.getString("title"));
                application.setCompany(rs.getString("company"));
                application.setRequiredSkills(rs.getString("required_skills"));
                application.setSalary(rs.getString("salary"));

                application.setMatchPercentage(
                        rs.getDouble("match_percentage"));

                application.setMatchedSkills(
                        rs.getString("matched_skills"));

                application.setMissingSkills(
                        rs.getString("missing_skills"));

                applications.add(application);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return applications;
    }



    @Override
    public boolean updateStatus(int applicationId, String status) {

        boolean result = false;

        try {

            String sql =
            "UPDATE applications SET status=? WHERE application_id=?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, applicationId);

            int rows = ps.executeUpdate();

            if(rows > 0) {
                result = true;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}