'use strict';

$('#loginBtn').click(function () {
    var id = $('#userId').val();
    var pw = $('#userPassword').val();
    $.get('/rest/signin', {
        userId: id,
        userPw: pw
    }, function (result) {
        var check = "";
        var length = Object.keys(result).length;
        for (var num = 10; num < length - 1; num++) {
            check += result[num];
        }
        if (check === "true") {
            location.replace("/board");
        }
        else if (check === "") {
            alert("wrong id!");
        }
        else {
            alert("wrong password!");
        }
    })
});
$('#signupbtn').click(function () {
    window.open("/signup", "", "width=500px,height=500px");
    window.focus();
});