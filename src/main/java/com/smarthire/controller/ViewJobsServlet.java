package com.smarthire.controller;

import java.io.IOException;
import java.util.List;

import com.smarthire.dao.JobDAO;
import com.smarthire.daoimpl.JobDAOImpl;
import com.smarthire.model.Job;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewJobs")
public class ViewJobsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        JobDAO jobDAO = new JobDAOImpl();

        List<Job> jobs = jobDAO.getAllJobs();

        System.out.println("Total jobs fetched: " + jobs.size());

        request.setAttribute("jobs", jobs);

        request.getRequestDispatcher("jobs.jsp")
               .forward(request, response);
    }
}