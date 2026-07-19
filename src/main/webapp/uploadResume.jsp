<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>

<title>Upload Resume - SmartHire</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

background:linear-gradient(135deg,#e0e7ff,#f8fafc);
font-family:'Segoe UI',sans-serif;

}


.container{

margin-top:60px;

}


.resume-card{

background:white;

padding:40px;

border-radius:25px;

box-shadow:0 10px 30px rgba(0,0,0,0.15);

max-width:600px;

margin:auto;

}



.brand{

text-align:center;

font-size:18px;

font-weight:600;

color:#0d6efd;

margin-bottom:10px;

}



.title{

text-align:center;

font-size:32px;

font-weight:700;

}



.subtitle{

text-align:center;

color:#666;

margin-bottom:25px;

}



.ai-box{

background:#f0f4ff;

padding:15px;

border-radius:15px;

text-align:center;

margin-bottom:25px;

color:#333;

}



.form-label{

font-weight:600;

}



.form-control{

border-radius:12px;

padding:12px;

}



.upload-btn{

border-radius:30px;

padding:12px 35px;

font-size:17px;

font-weight:600;

}



.upload-btn:hover{

transform:scale(1.05);

}



.info-card{

margin-top:25px;

background:#f8f9fa;

padding:15px;

border-radius:15px;

font-size:14px;

}


</style>


</head>


<body>


<div class="container">


<div class="resume-card">


<div class="brand">

🚀 SmartHire AI

</div>


<h2 class="title">

📄 Upload Resume

</h2>


<p class="subtitle">

AI Resume Screening & Job Recommendation System

</p>



<div class="ai-box">

🤖 AI will analyze your skills and calculate job match percentage

</div>



<form action="uploadResume" method="post">



placeholder="Enter User ID">





<label class="form-label">

📂 Resume File Name

</label>


<input type="text"

name="resumeFile"

class="form-control mb-3"

placeholder="Example: resume.pdf">





<label class="form-label">

🛠 Skills

</label>


<input type="text"

name="skills"

class="form-control mb-4"

placeholder="Example: Java, Python, MySQL, AI">





<div class="text-center">


<button type="submit"

class="btn btn-primary upload-btn">

🚀 Analyze Resume

</button>


</div>


</form>



<div class="info-card">

✅ Extract Skills<br>

✅ AI Match Score Calculation<br>

✅ Missing Skills Analysis<br>

✅ Job Recommendations

</div>



</div>


</div>


</body>

</html>