'use strict';

document.getElementById("loginBtn").onclick = function () {
    var id = $('#userId').val();
    var pw = $('#userPassword').val();
    $.get('/rest/signin', {
        userId: id,
        userPw: pw
    }, function (result) {
        var check="";
        console.dir(result);
        var length = Object.keys(result).length;
        for(var num=10;num<length-1;num++) {
            check +=result[num];
        }
        console.dir(check);

        if (check === "true") {
            location.replace("/");
        }
            else {
            alert("wrong password!");
        }
    })
};
var signupBtn = document.getElementById("signupBtn");
signupBtn.onclick = function () {
    window.open("/signup", "", "width=500px,height=500px");
    window.focus();
}