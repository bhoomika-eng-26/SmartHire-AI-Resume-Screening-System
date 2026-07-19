<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Resume Uploaded - SmartHire AI</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

background:linear-gradient(135deg,#eef2ff,#f8fafc);

font-family:'Segoe UI',sans-serif;

}



.success-container{

min-height:100vh;

display:flex;

justify-content:center;

align-items:center;

}



.success-card{

background:white;

padding:45px;

border-radius:30px;

text-align:center;

max-width:550px;

box-shadow:0 10px 30px rgba(0,0,0,0.15);

}



.logo{

font-size:28px;

font-weight:800;

color:#2563eb;

margin-bottom:20px;

}



.success-icon{

font-size:80px;

margin-bottom:20px;

}



h2{

font-weight:800;

color:#198754;

}



.message{

font-size:18px;

color:#555;

margin-top:15px;

}



.feature-box{

background:#f8fafc;

border-radius:15px;

padding:20px;

margin-top:25px;

text-align:left;

}



.btn-dashboard{

margin-top:25px;

border-radius:25px;

padding:12px 35px;

font-weight:700;

}



</style>


</head>


<body>


<div class="success-container">


<div class="success-card">


<div class="logo">

🚀 SmartHire AI

</div>


<div class="success-icon">

✅

</div>


<h2>

Resume Uploaded Successfully!

</h2>



<p class="message">

Your resume has been analyzed by AI.

Your skills are now ready for job matching.

</p>



<div class="feature-box">


<h5>

🤖 AI Processing Completed

</h5>


<p>

✅ Skills Extracted

<br>

✅ Resume Profile Created

<br>

✅ Job Match Enabled

<br>

✅ Missing Skills Analysis Ready

</p>


</div>




<a href="dashboard.jsp"

class="btn btn-primary btn-dashboard">

⬅ Back to Dashboard

</a>



<a href="viewJobs"

class="btn btn-success btn-dashboard">

💼 View Jobs

</a>



</div>


</div>


</body>

</html>