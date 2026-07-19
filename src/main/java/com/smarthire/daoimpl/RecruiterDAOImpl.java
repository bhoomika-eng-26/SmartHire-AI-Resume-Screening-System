package com.smarthire.daoimpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.smarthire.dao.RecruiterDAO;
import com.smarthire.dbutil.DBConnection;
import com.smarthire.model.Application;


public class RecruiterDAOImpl implements RecruiterDAO {


    Connection connection = DBConnection.getConnection();



    @Override
    public List<Application> getAllApplicants() {


        List<Application> applicants = new ArrayList<>();


        try {


            String sql =
            "SELECT "
            + "a.application_id,"
            + "a.status,"
            + "a.match_percentage,"
            + "a.matched_skills,"
            + "a.missing_skills,"
            + "u.name,"
            + "u.email,"
            + "u.phone,"
            + "u.skills,"
            + "u.cgpa,"
            + "j.title,"
            + "j.company "
            + "FROM applications a "
            + "JOIN users u ON a.user_id = u.user_id "
            + "JOIN jobs j ON a.job_id = j.job_id";

            
            PreparedStatement ps =
                    connection.prepareStatement(sql);



            ResultSet rs =
                    ps.executeQuery();



            while(rs.next()) {


                Application app = new Application();



                app.setApplicationId(
                        rs.getInt("application_id"));



                app.setStatus(
                        rs.getString("status"));



                app.setMatchPercentage(
                        rs.getDouble("match_percentage"));



                // AI Skill Analysis

                app.setMatchedSkills(
                        rs.getString("matched_skills"));



                app.setMissingSkills(
                        rs.getString("missing_skills"));



                app.setCandidateName(
                        rs.getString("name"));



                app.setEmail(
                        rs.getString("email"));



                app.setPhone(
                        rs.getString("phone"));



                app.setSkills(
                        rs.getString("skills"));



                app.setCgpa(
                        rs.getDouble("cgpa"));



                app.setTitle(
                        rs.getString("title"));



                app.setCompany(
                        rs.getString("company"));



                applicants.add(app);

            }



        } catch(Exception e) {


            e.printStackTrace();

        }



        return applicants;


    }


}