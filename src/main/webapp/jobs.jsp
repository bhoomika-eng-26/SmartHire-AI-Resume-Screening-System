<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.smarthire.model.Job" %>

<!DOCTYPE html>
<html>

<head>

<title>SmartHire - Available Jobs</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

background:linear-gradient(135deg,#eef2ff,#f8fafc);
font-family:'Segoe UI',sans-serif;

}


.container{

margin-top:45px;

}



.page-title{

text-align:center;
font-size:35px;
font-weight:800;
color:#1e293b;

}



.subtitle{

text-align:center;
color:#64748b;
margin-bottom:35px;

}



.job-card{

background:white;

border-radius:25px;

padding:30px;

margin-bottom:25px;

box-shadow:0 10px 25px rgba(0,0,0,0.12);

transition:0.3s;

}



.job-card:hover{

transform:translateY(-8px);

box-shadow:0 15px 35px rgba(0,0,0,0.18);

}



.job-title{

font-size:26px;

font-weight:800;

color:#2563eb;

}



.company{

font-size:19px;

font-weight:700;

color:#16a34a;

}



.ai-badge{

background:#ede9fe;

color:#7c3aed;

padding:8px 15px;

border-radius:20px;

font-size:14px;

font-weight:600;

}



.skill-badge{

background:#eff6ff;

color:#2563eb;

padding:8px 14px;

border-radius:20px;

display:inline-block;

margin:5px;

font-weight:500;

}



.salary{

font-size:18px;

font-weight:700;

color:#334155;

}



.apply-btn{

border-radius:25px;

padding:12px 35px;

font-weight:700;

font-size:16px;

}



.back-btn{

border-radius:25px;

}



</style>


</head>



<body>


<div class="container">


<h2 class="page-title">

💼 Available Jobs

</h2>


<p class="subtitle">

Find the best opportunities with AI-powered job matching

</p>




<%

List<Job> jobs = (List<Job>)request.getAttribute("jobs");


if(jobs != null && !jobs.isEmpty()){


for(Job job : jobs){


%>



<div class="job-card">



<div class="d-flex justify-content-between align-items-center">


<div class="job-title">

💼 <%=job.getTitle()%>

</div>


<span class="ai-badge">

🤖 AI Matching

</span>


</div>



<div class="company mt-3">

🏢 <%=job.getCompany()%>

</div>


<hr>



<p>

<b>🛠 Required Skills</b>

</p>



<%

String skills = job.getRequiredSkills();

String skillArray[] = skills.split(",");


for(String skill : skillArray){

%>


<span class="skill-badge">

<%=skill.trim()%>

</span>


<%

}

%>



<br><br>


<p class="salary">

💰 Salary :

<%=job.getSalary()%>

</p>



<form action="applyJob" method="post">


<input type="hidden"

name="jobId"

value="<%=job.getJobId()%>">


<button type="submit"

class="btn btn-primary apply-btn">

🚀 Apply Now

</button>


</form>


</div>



<%

}

}else{

%>


<div class="alert alert-warning text-center">

No Jobs Available

</div>


<%

}

%>



<div class="text-center mt-4">


<a href="dashboard.jsp"

class="btn btn-dark btn-lg back-btn">

⬅ Back to Dashboard

</a>


</div>



</div>


</body>

</html>