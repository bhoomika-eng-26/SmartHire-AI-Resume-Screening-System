package com.smarthire.controller;


import java.io.IOException;
import java.util.List;

import com.smarthire.dao.RecruiterDAO;
import com.smarthire.daoimpl.RecruiterDAOImpl;
import com.smarthire.model.Application;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/recruiter")
public class RecruiterServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;



    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {



        RecruiterDAO recruiterDAO =
                new RecruiterDAOImpl();



        List<Application> applicants =
                recruiterDAO.getAllApplicants();



        request.setAttribute(
                "applicants",
                applicants);



        request.getRequestDispatcher(
                "recruiterDashboard.jsp")
                .forward(request, response);



    }


}