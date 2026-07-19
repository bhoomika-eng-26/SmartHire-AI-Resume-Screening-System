package com.smarthire.controller;

import java.io.IOException;

import com.smarthire.ai.ResumeMatcher;
import com.smarthire.ai.SkillAnalyzer;
import com.smarthire.dao.ApplicationDAO;
import com.smarthire.dao.JobDAO;
import com.smarthire.dao.ResumeDAO;
import com.smarthire.daoimpl.ApplicationDAOImpl;
import com.smarthire.daoimpl.JobDAOImpl;
import com.smarthire.daoimpl.ResumeDAOImpl;
import com.smarthire.model.Application;
import com.smarthire.model.Job;
import com.smarthire.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/applyJob")
public class ApplyJobServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = user.getUserId();
        int jobId = Integer.parseInt(request.getParameter("jobId"));

        ResumeDAO resumeDAO = new ResumeDAOImpl();
        String resumeSkills = resumeDAO.getSkillsByUserId(userId);

        JobDAO jobDAO = new JobDAOImpl();
        Job job = jobDAO.getJobById(jobId);

        String jobSkills = job.getRequiredSkills();

        double matchPercentage =
                ResumeMatcher.calculateMatch(resumeSkills, jobSkills);

        String matchedSkills =
                SkillAnalyzer.findMatchedSkills(resumeSkills, jobSkills);

        String missingSkills =
                SkillAnalyzer.findMissingSkills(resumeSkills, jobSkills);

        System.out.println("Resume Skills = " + resumeSkills);
        System.out.println("Job Skills = " + jobSkills);
        System.out.println("Match Percentage = " + matchPercentage);
        System.out.println("Matched Skills = " + matchedSkills);
        System.out.println("Missing Skills = " + missingSkills);

        Application application = new Application(userId, jobId, "Applied");

        application.setMatchPercentage(matchPercentage);
        application.setMatchedSkills(matchedSkills);
        application.setMissingSkills(missingSkills);

        ApplicationDAO applicationDAO = new ApplicationDAOImpl();

        boolean status = applicationDAO.applyJob(application);

        if (status) {
            response.sendRedirect("applicationSuccess.jsp");
        } else {
            response.sendRedirect("jobs.jsp");
        }
    }
}