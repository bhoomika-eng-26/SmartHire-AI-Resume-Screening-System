package com.smarthire.controller;

import java.io.IOException;
import java.util.List;

import com.smarthire.dao.ApplicationDAO;
import com.smarthire.daoimpl.ApplicationDAOImpl;
import com.smarthire.model.Application;
import com.smarthire.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/myApplications")
public class MyApplicationsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession(false);


        if(session == null || session.getAttribute("user") == null) {

            response.sendRedirect("login.jsp");
            return;

        }


        User user = (User) session.getAttribute("user");


        int userId = user.getUserId();

        System.out.println("Logged User ID = " + userId);

        ApplicationDAO applicationDAO =
                new ApplicationDAOImpl();


        List<Application> applications =
                applicationDAO.getApplicationsByUserId(userId);


        request.setAttribute("applications", applications);


        request.getRequestDispatcher("myApplications.jsp")
               .forward(request, response);

    }

}