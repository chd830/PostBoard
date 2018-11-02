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
            document.cookie="cookie = "+id;
            location.replace("/");
        }
            else {
            alert("wrong password!");
        }
    })
};