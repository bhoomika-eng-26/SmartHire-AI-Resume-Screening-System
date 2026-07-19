package com.smarthire.controller;

import java.io.IOException;

import com.smarthire.dao.ApplicationDAO;
import com.smarthire.daoimpl.ApplicationDAOImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/updateApplicationStatus")
public class UpdateApplicationStatusServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {



        int applicationId =
                Integer.parseInt(
                request.getParameter("applicationId"));



        String status =
                request.getParameter("status");



        ApplicationDAO dao =
                new ApplicationDAOImpl();



        dao.updateStatus(applicationId, status);



        response.sendRedirect("recruiter");

    }

}