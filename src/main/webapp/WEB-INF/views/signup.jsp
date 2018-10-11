<%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2018-10-03
  Time: 오전 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
    <link type="text/css" rel="stylesheet" href="/resources/css/signup.css"/>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css">
</head>
<body>
<div>
    <div class="container">
        <h1>Sign Up</h1>
        <hr>
        <div class="signup_form">
            <label for="userid"><b>ID</b></label>
            <input id="id" type="text" placeholder="Enter ID" name="id" required>
        </div>
        <div class="signup_form">
            <label for="nickname"><b>Nickname</b></label>
            <input id="username" type="text" placeholder="Enter Nickname" name="nickname" required>
        </div>
        <div class="signup_form">
            <label for="email"><b>Email</b></label>
            <input id="email" type="text" placeholder="Enter Email" name="email" required>
        </div>
        <div class="signup_form">
            <label for="psw"><b>Password</b></label>
            <input id="psw" type="password" placeholder="Enter Password" name="psw" required>
        </div>
        <div class="signup_form">
            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input id="repsw" type="password" placeholder="Repeat Password" name="psw-repeat" required>
        </div>

        <div class="clearfix">
            <button type="button" id="cancelbtn">Cancel</button>
            <button type="submit" id="signupbtn">Sign Up</button>
        </div>
    </div>
<div>
<!-- Bootstrap core JavaScript -->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<script src="/resources/js/signup.js"></script>

</body>
</html>
