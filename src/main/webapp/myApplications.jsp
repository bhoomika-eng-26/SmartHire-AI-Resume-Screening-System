```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.smarthire.model.Application" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>My Applications</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background: linear-gradient(135deg,#eef2f3,#dfe9f3);
    font-family: 'Segoe UI', sans-serif;
}

.container{
    margin-top:40px;
}

.page-title{
    text-align:center;
    font-size:32px;
    font-weight:700;
    margin-bottom:35px;
}


.application-card{

    background:white;
    border-radius:20px;
    padding:25px;
    margin-bottom:25px;

    box-shadow:0 8px 20px rgba(0,0,0,0.15);

    transition:0.3s;

}


.application-card:hover{

    transform:translateY(-5px);

}


.job-title{

    font-size:24px;
    font-weight:700;
    color:#0d6efd;

}


.company{

    font-size:18px;
    color:#198754;
    font-weight:600;

}


.label{

    font-weight:600;

}


.progress{

    height:28px;
    border-radius:20px;

}


.progress-bar{

    font-weight:bold;

}


.status{

    font-size:15px;
    padding:8px 15px;
    border-radius:20px;

}


</style>

</head>


<body>


<div class="container">


<h2 class="page-title">

📋 My Applications

</h2>


<%

List<Application> applications =
(List<Application>)request.getAttribute("applications");


if(applications!=null && !applications.isEmpty()){


for(Application app:applications){


double score=app.getMatchPercentage();


%>



<div class="application-card">


<div class="job-title">

💼 <%=app.getTitle()%>

</div>


<div class="company mt-2">

🏢 <%=app.getCompany()%>

</div>


<hr>


<p>

<span class="label">

🛠 Required Skills:

</span>

<%=app.getRequiredSkills()%>


</p>


<p>

<span class="label">

💰 Salary:

</span>

<%=app.getSalary()%>


</p>



<p>
<b>✅ Matched Skills:</b><br>
<%=app.getMatchedSkills()%>
</p>

<p>
<b>❌ Missing Skills:</b><br>
<%=app.getMissingSkills()%>
</p>



<div class="progress mb-3">


<div class="progress-bar bg-success"

style="width:<%=score%>%">

<%=score%>%


</div>


</div>




<p>


<span class="label">

Status:

</span>


<%

String status=app.getStatus();


if(status.equalsIgnoreCase("Applied")){

%>


<span class="badge bg-warning text-dark status">

🟡 Applied

</span>


<%


}else if(status.equalsIgnoreCase("Shortlisted")){


%>


<span class="badge bg-success status">

🟢 Shortlisted

</span>


<%


}else{


%>


<span class="badge bg-danger status">

🔴 Rejected

</span>


<%


}


%>


</p>



</div>



<%


}


}else{


%>


<div class="alert alert-warning text-center">

No Applications Found

</div>


<%


}


%>



<div class="text-center mt-4">


<a href="dashboard.jsp"

class="btn btn-dark btn-lg">

⬅ Back to Dashboard

</a>


</div>


</div>


</body>

</html>
```
