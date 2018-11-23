'use strict';
$('#signupbtn').click(function() {
    var userId = $('#id').val();
    var username = $('#username').val();
    var email = $('#email').val();
    var psw = $('#psw').val();
    var repsw = $('#repsw').val();
    if (psw !== repsw)
        alert("password is not same value");
    else {
        $.post('/rest/signup', {
            userId: userId,
            userName: username,
            email: email,
            userPw: psw,
        });
        window.close();
    }
});
$('#cancelbtn').click(function() {
        window.close();
});
