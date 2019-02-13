<%--
  Created by IntelliJ IDEA.
  User: chd96
  Date: 2018-10-01
  Time: 오후 11:39
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Login</title>
    <link type="text/css" rel="stylesheet" href="/resources/css/signin.css"/>
</head>
<body>
<div class="login">
    <div class="heading">
            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" id="userId" class="form-control" placeholder="Username or email">
            </div>

            <div class="input-group input-group-lg">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" id="userPassword" class="form-control" placeholder="Password">
            </div>
            <button id="loginBtn" type="submit" class="float">Login</button>
            <div id="signupBtn">SignUp</div>
    </div>
    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="/resources/js/signin.js"></script>
</div>
</body>
</html>
