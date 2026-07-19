```jsp id="g2x9lm"
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.smarthire.model.Application" %>

<html>

<head>

<title>Recruiter Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

background:#f4f7fb;
font-family:'Segoe UI',sans-serif;

}


.dashboard-title{

text-align:center;
font-size:32px;
font-weight:700;
margin-bottom:35px;

}



.applicant-card{

background:white;
border-radius:20px;
padding:30px;
margin-bottom:30px;

box-shadow:0 8px 20px rgba(0,0,0,0.15);

transition:0.3s;

}



.applicant-card:hover{

transform:translateY(-5px);

}



.candidate-name{

font-size:25px;
font-weight:700;
color:#0d6efd;

}



.job-title{

font-size:20px;
font-weight:600;
color:#198754;

}



.skill{

background:#e8f3ff;
color:#0d6efd;

padding:7px 12px;

border-radius:20px;

display:inline-block;

margin:3px;

}



.progress{

height:28px;
border-radius:20px;

}



.btn{

border-radius:20px;

}


</style>


</head>


<body>


<div class="container mt-5">


<h2 class="dashboard-title">

🏢 SmartHire Recruiter Dashboard

</h2>



<%

List<Application> applicants =
(List<Application>) request.getAttribute("applicants");


if(applicants != null && !applicants.isEmpty()){


for(Application app : applicants){


%>



<div class="applicant-card">



<h3 class="candidate-name">

👤 <%=app.getCandidateName()%>

</h3>



<p>

📧 <%=app.getEmail()%>

<br>

📞 <%=app.getPhone()%>

</p>



<hr>



<h5>

🛠 Skills

</h5>


<%

String skills = app.getSkills();

String skillArray[] = skills.split(",");


for(String skill : skillArray){

%>


<span class="skill">

<%=skill.trim()%>

</span>


<%

}

%>



<br><br>


<p>

🎓 <b>CGPA:</b>

<%=app.getCgpa()%>

</p>



<hr>



<h4 class="job-title">

💼 Applied For:

<%=app.getTitle()%>

</h4>


<p>

🏢 Company:

<%=app.getCompany()%>

</p>



<p>
<b>✅ Matched Skills:</b><br>
<%=app.getMatchedSkills()%>
</p>


<p>
<b>❌ Missing Skills:</b><br>
<%=app.getMissingSkills()%>
</p>


<div class="progress">


<div class="progress-bar bg-success"

style="width:<%=app.getMatchPercentage()%>%">

<%=app.getMatchPercentage()%>%


</div>


</div>



<br>



<p>

<b>Status:</b>


<%

String status=app.getStatus();


if(status.equalsIgnoreCase("Applied")){

%>


<span class="badge bg-warning text-dark">

🟡 Applied

</span>


<%

}else if(status.equalsIgnoreCase("Shortlisted")){

%>


<span class="badge bg-success">

🟢 Shortlisted

</span>


<%

}else{

%>


<span class="badge bg-danger">

🔴 Rejected

</span>


<%

}

%>


</p>




<form action="updateApplicationStatus" method="post">


<input type="hidden"

name="applicationId"

value="<%=app.getApplicationId()%>">



<button type="submit"

name="status"

value="Shortlisted"

class="btn btn-success me-2">

✅ Shortlist

</button>




<button type="submit"

name="status"

value="Rejected"

class="btn btn-danger">

❌ Reject

</button>


</form>



</div>


<%

}

}else{

%>


<div class="alert alert-warning text-center">

No Applicants Found

</div>


<%

}

%>


</div>


</body>

</html>
```
