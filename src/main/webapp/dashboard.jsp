<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.smarthire.model.User" %>


<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>SmartHire Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>


body{

background:linear-gradient(135deg,#eef2ff,#f8fafc);

font-family:'Segoe UI',sans-serif;

}


.navbar-brand{

font-size:22px;
font-weight:800;

}


.nav-link{

font-weight:600;
margin-left:15px;

}



.container{

margin-top:40px;

}



.hero{

background:white;

padding:45px;

border-radius:25px;

box-shadow:0 10px 30px rgba(0,0,0,0.12);

text-align:center;

margin-bottom:35px;

}



.brand{

font-size:22px;

font-weight:800;

color:#2563eb;

}



.hero h1{

font-size:42px;

font-weight:800;

color:#1e293b;

}



.subtitle{

font-size:20px;

color:#64748b;

}



/* Profile */


.profile-card{

background:white;

border-radius:25px;

padding:30px;

box-shadow:0 8px 25px rgba(0,0,0,0.12);

margin-bottom:35px;

}



.profile-title{

font-size:28px;

font-weight:700;

text-align:center;

margin-bottom:25px;

}



/* Dashboard cards */


.dashboard-card{

background:white;

border-radius:22px;

padding:35px;

text-align:center;

box-shadow:0 8px 25px rgba(0,0,0,0.12);

transition:0.3s;

}



.dashboard-card:hover{

transform:translateY(-8px);

}



.icon{

font-size:50px;

}



.card-title{

font-size:23px;

font-weight:700;

margin-top:15px;

}



.open-btn{

border-radius:25px;

padding:10px 35px;

font-weight:600;

}



/* Features */


.feature-box{

background:white;

border-radius:22px;

padding:35px;

box-shadow:0 8px 25px rgba(0,0,0,0.12);

}



.feature-item{

background:#f8fafc;

border-radius:12px;

padding:14px;

margin-bottom:12px;

font-weight:600;

}



.logout{

border-radius:25px;

padding:10px 40px;

}



</style>


</head>


<body>



<nav class="navbar navbar-expand-lg bg-white shadow-sm">


<div class="container-fluid">


<a class="navbar-brand text-primary" href="dashboard.jsp">

🚀 SmartHire AI

</a>



<button class="navbar-toggler"
type="button"
data-bs-toggle="collapse"
data-bs-target="#navbarNav">


<span class="navbar-toggler-icon"></span>

</button>



<div class="collapse navbar-collapse" id="navbarNav">


<ul class="navbar-nav ms-auto">


<li class="nav-item">
<a class="nav-link" href="dashboard.jsp">
Home
</a>
</li>


<li class="nav-item">
<a class="nav-link" href="viewJobs">
Jobs
</a>
</li>


<li class="nav-item">
<a class="nav-link" href="myApplications">
Applications
</a>
</li>


<li class="nav-item">
<a class="nav-link" href="recruiter">
Recruiter
</a>
</li>


<li class="nav-item">
<a class="nav-link text-danger" href="logout">
Logout
</a>
</li>


</ul>


</div>


</div>


</nav>





<div class="container">



<div class="hero">


<div class="brand">

SmartHire AI

</div>


<h1>

SmartHire Dashboard

</h1>



<p class="subtitle">

AI Resume Screening & Job Recommendation System

</p>


<p>

🤖 Intelligent Hiring | Skill Matching | Career Recommendations

</p>


</div>






<%

User user = (User)session.getAttribute("user");


if(user != null){

%>



<div class="profile-card">


<h3 class="profile-title">

👤 My Profile

</h3>



<div class="row">


<div class="col-md-6">


<p>

<b>👤 Name:</b>

<%=user.getName()%>

</p>


<p>

<b>📧 Email:</b>

<%=user.getEmail()%>

</p>


<p>

<b>📞 Phone:</b>

<%=user.getPhone()%>

</p>


</div>



<div class="col-md-6">


<p>

<b>🛠 Skills:</b>

<%=user.getSkills()%>

</p>



<p>

<b>🎓 CGPA:</b>

<%=user.getCgpa()%>

</p>



<p>

<b>📄 Resume Status:</b>

<span class="badge bg-success">

Uploaded ✅

</span>

</p>


</div>



</div>


</div>



<%

}

%>







<div class="row">



<div class="col-md-6 mb-4">


<div class="dashboard-card">


<div class="icon">

📄

</div>


<div class="card-title">

Upload Resume

</div>


<p>

AI analyzes your skills and creates your profile

</p>


<a href="uploadResume.jsp"

class="btn btn-primary open-btn">

Upload

</a>


</div>


</div>






<div class="col-md-6 mb-4">


<div class="dashboard-card">


<div class="icon">

💼

</div>


<div class="card-title">

View Jobs

</div>


<p>

Explore jobs based on your skills

</p>


<a href="viewJobs"

class="btn btn-success open-btn">

Explore

</a>


</div>


</div>






<div class="col-md-6 mb-4">


<div class="dashboard-card">


<div class="icon">

📋

</div>


<div class="card-title">

My Applications

</div>


<p>

Track AI score and application status

</p>


<a href="myApplications"

class="btn btn-warning open-btn">

View

</a>


</div>


</div>






<div class="col-md-6 mb-4">


<div class="dashboard-card">


<div class="icon">

👨‍💼

</div>


<div class="card-title">

Recruiter Dashboard

</div>


<p>

Manage candidates and hiring process

</p>


<a href="recruiter"

class="btn btn-info open-btn">

Open

</a>


</div>


</div>



</div>







<div class="feature-box">


<h3 class="text-center mb-4">

📊 SmartHire AI Features

</h3>


<div class="feature-item">

✅ Student Registration & Login

</div>


<div class="feature-item">

✅ Resume Upload & Skill Extraction

</div>


<div class="feature-item">

✅ AI Resume Matching

</div>


<div class="feature-item">

✅ Match Percentage Calculation

</div>


<div class="feature-item">

✅ Missing Skills Analysis

</div>


<div class="feature-item">

✅ Job Search & Apply

</div>


<div class="feature-item">

✅ Recruiter Shortlist / Reject System

</div>


</div>




</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>