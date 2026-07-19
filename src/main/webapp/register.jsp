<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>SmartHire AI - Register</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">


<style>

body{

    background: linear-gradient(135deg,#eef2ff,#f8fafc);
    font-family:'Segoe UI',sans-serif;

}


.register-container{

    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;

}


.register-card{

    width:100%;
    max-width:550px;
    background:white;

    padding:40px;

    border-radius:25px;

    box-shadow:0 10px 30px rgba(0,0,0,0.15);

}


.logo{

    text-align:center;

    font-size:28px;

    font-weight:800;

    color:#2563eb;

}


.title{

    text-align:center;

    font-size:30px;

    font-weight:800;

    margin-top:15px;

}


.subtitle{

    text-align:center;

    color:#64748b;

    margin-bottom:30px;

}



.form-label{

    font-weight:700;

}



.form-control{

    border-radius:15px;

    padding:12px;

}



.register-btn{

    width:100%;

    padding:12px;

    border-radius:25px;

    font-size:17px;

    font-weight:700;

}



.login-link{

    text-align:center;

    margin-top:20px;

}


.login-link a{

    text-decoration:none;

    font-weight:600;

}



</style>


</head>


<body>


<div class="register-container">


<div class="register-card">


<div class="logo">

🚀 SmartHire AI

</div>


<h2 class="title">

Create Account

</h2>


<p class="subtitle">

Build your AI-powered career profile

</p>



<form action="register" method="post">



<label class="form-label">

👤 Name

</label>

<input type="text"

name="name"

class="form-control mb-3"

placeholder="Enter your name"

required>



<label class="form-label">

📧 Email

</label>

<input type="email"

name="email"

class="form-control mb-3"

placeholder="Enter email"

required>



<label class="form-label">

🔒 Password

</label>

<input type="password"

name="password"

class="form-control mb-3"

placeholder="Create password"

required>



<label class="form-label">

📞 Phone

</label>

<input type="text"

name="phone"

class="form-control mb-3"

placeholder="Phone number"

required>



<label class="form-label">

🛠 Skills

</label>

<input type="text"

name="skills"

class="form-control mb-3"

placeholder="Java, Python, SQL, AI"

required>



<label class="form-label">

🎓 CGPA

</label>

<input type="text"

name="cgpa"

class="form-control mb-4"

placeholder="Enter CGPA"

required>




<button type="submit"

class="btn btn-primary register-btn">

🚀 Create Account

</button>



</form>



<div class="login-link">

Already have an account?

<a href="login.jsp">

Login

</a>


</div>



</div>


</div>



</body>


</html>