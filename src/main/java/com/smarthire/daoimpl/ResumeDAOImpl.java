package com.smarthire.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.smarthire.dao.ResumeDAO;
import com.smarthire.dbutil.DBConnection;
import com.smarthire.model.Resume;

public class ResumeDAOImpl implements ResumeDAO {

    Connection connection = DBConnection.getConnection();

    @Override
    public boolean uploadResume(Resume resume) {

        boolean status = false;

        try {

            String sql =
            "INSERT INTO resumes(user_id,resume_file,skills) VALUES(?,?,?)";

            PreparedStatement ps =
            connection.prepareStatement(sql);

            ps.setInt(1, resume.getUserId());
            ps.setString(2, resume.getResumeFile());
            ps.setString(3, resume.getSkills());

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
    public String getSkillsByUserId(int userId) {

        String skills = null;

        try {

            String sql =
            "SELECT skills FROM resumes WHERE user_id=? ORDER BY resume_id DESC LIMIT 1";

            PreparedStatement ps =
            connection.prepareStatement(sql);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                skills = rs.getString("skills");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return skills;
    }
}