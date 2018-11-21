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
        <form>

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
        </form>
    </div>
    <!-- Bootstrap core JavaScript -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js"></script>
    <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script src="/resources/js/signin.js"></script>
</div>
</body>
</html>
