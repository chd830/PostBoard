'use strict';

document.getElementById("loginBtn").onclick = function() {
    var id=$('#userId').val();
    var pw=$('#userPassword').val();

    $.get('/rest/login',{
        userId: id,
        userPw: pw
    },function(result) {
        if(result !== null) {
            window.cookie=id;
            location.href=result;
        }
        else {
            alert("wrong password!");
        }
    })
};
document.getElementById("signupBtn").onclick = function() {
    window.open("signup","","width=500px,height=500px");
    window.focus();
}
