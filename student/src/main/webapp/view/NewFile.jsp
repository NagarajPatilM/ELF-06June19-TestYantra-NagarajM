<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Login Page</h2>
    <br><br>
        <form class="form-size" action="./login" method="POST">
            <input type="number" class="form-control margin-bottom-input" name="id" placeholder="Enter id"/>
            <div class="form-control">
                <input type="password" id="pwd"  name="password" style="border: none !important;width:340px;" placeholder="Enter password"/>
                <span class="glyphicon glyphicon-eye-open" onclick="showPassword()"></span>
            </div>
            <br>
            <button type="submit" class="btn btn-primary">Submit</button>
            <br><br>
            <div class="row">
                <button class="col-6 btn btn-primary"><a href="Employee information.html" style="color: white !important">Create Account</a></button>
                <button  class="col-6 btn btn-primary">Forgot Password</button>
            </div>
        </form>
    </div>
</body>
</html>