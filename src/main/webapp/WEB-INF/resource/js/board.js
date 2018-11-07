'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
$(document).ready(function () {
    $('#sign-in').css('visibility', 'visible');
    $('#sign-up').css('visibility', 'visible');
    $('#log-out').css('visibility', 'hidden');

    $.get('/rest/board', {}, function (result) {
        console.log("result:" + result);
        var count=0;
        for (var i = 0; i < result.length; i++)
            for (var j = 0; j < 3; j++) {
                if(count===0) $('#h2cardOne').text(result[i][j]);
                else if(count===1) $('#h2cardTwo').text(result[i][j]);
                else if(count===2) $('#h2cardThree').text(result[i][j]);
                else if(count===3) $('#h4cardOne').text(result[i][j]);
                else if(count===4) $('#h4cardTwo').text(result[i][j]);
                else $('#h4cardThree').text(result[i][j]);
                count++;
                console.log("result:[" + i + "][" + j + "]:" + result[i][j]);
            }

        //             $('#h2cardOne').text(val);
        //             $('#h2cardTwo').text(val);
        //             $('#h2cardThree').text(val);
        //         $('#h4cardOne').text(val);
        //         $('#h4cardTwo').text(val);
        //         $('#h4cardThree').text(val);
    })
});
var signinBtn = document.getElementById("sign-in");
signinBtn.onclick = function () {
    location.replace('/signin');
}
var signupBtn = document.getElementById("sign-up");
signupBtn.onclick = function () {
    window.open("/signup", "", "width=500px,height=500px");
    window.focus();
}
// if (document.cookie != "cookie = ") {
//     $('#sign-in').css('visibility', 'hidden');
//     $('#sign-up').css('visibility', 'hidden');
//     $('#log-out').css('visibility', 'visible');
// }
var logoutBtn = document.getElementById("log-out");
logoutBtn.onclick = function () {
    document.cookie = "cookie = ";
    alert("logout!");
    $('#sign-in').css('visibility', 'visible');
    $('#sign-up').css('visibility', 'visible');
    $('#log-out').css('visibility', 'hidden');
}
var writeBtn = document.getElementById("writeBtn");
writeBtn.onclick = function () {
    location.replace('/write');
}

