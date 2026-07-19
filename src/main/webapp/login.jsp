<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>SmartHire Login</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

background:linear-gradient(135deg,#eef2ff,#f8fafc);

font-family:'Segoe UI',sans-serif;

}


.login-card{

width:420px;

margin:80px auto;

background:white;

padding:40px;

border-radius:25px;

box-shadow:0 10px 30px rgba(0,0,0,0.15);

}


.brand{

text-align:center;

font-size:20px;

font-weight:700;

color:#2563eb;

}


h2{

text-align:center;

font-weight:800;

margin:15px;

}


.subtitle{

text-align:center;

color:#64748b;

margin-bottom:30px;

}


.form-control{

border-radius:15px;

padding:12px;

}


.btn-login{

width:100%;

border-radius:25px;

padding:12px;

font-weight:700;

}


.register-link{

text-align:center;

margin-top:20px;

}


</style>


</head>


<body>


<div class="login-card">


<div class="brand">

  SmartHire AI

</div>


<h2>

Welcome Back

</h2>


<p class="subtitle">

AI Resume Screening & Job Recommendation System

</p>



<form action="login" method="post">


<label class="fw-bold">

 Email

</label>


<input type="email"

name="email"

class="form-control mb-3"

placeholder="Enter email">



<label class="fw-bold">

 Password

</label>


<input type="password"

name="password"

class="form-control mb-4"

placeholder="Enter password">



<button type="submit"

class="btn btn-primary btn-login">

Login 

</button>


</form>



<div class="register-link">


Don't have an account?

<a href="register.jsp">

Create Account

</a>


</div>



</div>


</body>

</html>