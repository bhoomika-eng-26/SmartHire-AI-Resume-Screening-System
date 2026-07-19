package com.smarthire.controller;

import java.io.IOException;

import com.smarthire.dao.ResumeDAO;
import com.smarthire.daoimpl.ResumeDAOImpl;
import com.smarthire.model.Resume;
import com.smarthire.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/uploadResume")
public class UploadResumeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession();


        User user = (User) session.getAttribute("user");


        if(user == null){

            response.sendRedirect("login.jsp");
            return;

        }



        int userId = user.getUserId();



        String resumeFile =
                request.getParameter("resumeFile");



        String skills =
                request.getParameter("skills");



        System.out.println("Logged User ID = " + userId);
        System.out.println("Resume File = " + resumeFile);
        System.out.println("Skills = " + skills);



        Resume resume =
                new Resume(userId, resumeFile, skills);



        ResumeDAO resumeDAO =
                new ResumeDAOImpl();



        boolean status =
                resumeDAO.uploadResume(resume);



        if(status){

            response.sendRedirect("resumeSuccess.jsp");

        }
        else{

            response.sendRedirect("uploadResume.jsp");

        }


    }

}