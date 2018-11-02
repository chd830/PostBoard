'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
$(document).ready(function() {
    $('#myCarousel').carousel('cycle');
    $('#myCarousel2').carousel('cycle');
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
if (document.cookie != "cookie = ") {
    $('#sign-in').css('visibility', 'hidden');
    $('#sign-up').css('visibility', 'hidden');
    $('#log-out').css('visibility', 'visible');
}
var logoutBtn = document.getElementById("log-out");
logoutBtn.onclick = function () {
    document.cookie = "cookie = ";
    $('#sign-in').css('visibility', 'visible');
    $('#sign-up').css('visibility', 'visible');
    $('#log-out').css('visibility', 'hidden');
}
