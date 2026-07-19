package com.smarthire.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.smarthire.dao.UserDAO;
import com.smarthire.dbutil.DBConnection;
import com.smarthire.model.User;

public class UserDAOImpl implements UserDAO {

    Connection connection = DBConnection.getConnection();


    // Register User

    @Override
    public boolean registerUser(User user) {

        boolean status = false;

        try {

            String sql = "INSERT INTO users(name,email,password,phone,skills,cgpa) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getSkills());
            ps.setDouble(6, user.getCgpa());


            int result = ps.executeUpdate();


            if(result > 0) {

                status = true;

            }


        } catch(Exception e) {

            e.printStackTrace();

        }


        return status;

    }



    // Login User

    @Override
    public User loginUser(String email, String password) {


        User user = null;


        try {


            String sql = "SELECT * FROM users WHERE email=? AND password=?";


            PreparedStatement ps = connection.prepareStatement(sql);


            ps.setString(1, email);
            ps.setString(2, password);


            ResultSet rs = ps.executeQuery();



            if(rs.next()) {


                user = new User();


                user.setUserId(rs.getInt("user_id"));

                user.setName(rs.getString("name"));

                user.setEmail(rs.getString("email"));

                user.setPassword(rs.getString("password"));

                user.setPhone(rs.getString("phone"));

                user.setSkills(rs.getString("skills"));

                user.setCgpa(rs.getDouble("cgpa"));

            }


        } catch(Exception e) {


            e.printStackTrace();


        }


        return user;

    }

}