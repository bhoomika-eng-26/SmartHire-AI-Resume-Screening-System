package com.smarthire.controller;

import java.io.IOException;

import com.smarthire.dao.UserDAO;
import com.smarthire.daoimpl.UserDAOImpl;
import com.smarthire.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String skills = request.getParameter("skills");
        double cgpa = Double.parseDouble(request.getParameter("cgpa"));

        User user = new User(
                name,
                email,
                password,
                phone,
                skills,
                cgpa
        );

        UserDAO userDAO = new UserDAOImpl();

        boolean status = userDAO.registerUser(user);

        if(status) {
            response.sendRedirect("login.jsp");
        } else {
            response.sendRedirect("register.jsp");
        }
    }
}