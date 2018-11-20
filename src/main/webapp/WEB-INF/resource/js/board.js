'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
$(document).ready(function() {
    $('#sign-in').css('visibility', 'visible');
    $('#sign-up').css('visibility', 'visible');
    $('#log-out').css('visibility', 'hidden');


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
    // document.cookie = "cookie = ";
    alert("logout!");
    $('#sign-in').css('visibility', 'visible');
    $('#sign-up').css('visibility', 'visible');
    $('#log-out').css('visibility', 'hidden');
}
var writeBtn = document.getElementById("writeBtn");
writeBtn.onclick = function() {
    location.replace('/write');
}
$('#cardOne').click(function() {
    $.get('/rest/board',{
    },function(result) {
        for (var key in result) {
            console.log("key: "+key);
            console.log("value: "+result[key]);
        }

    })
})

