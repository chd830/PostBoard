'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

var signinBtn = document.getElementById("sign-in");
signinBtn.onclick = function () {
    location.replace('/signin');
}
var signupBtn = document.getElementById("sign-up");
signupBtn.onclick = function() {
    window.open("/signup", "", "width=500px,height=500px");
    window.focus();
}
if(document.cookie != "") {
    $('#sign-in').css('visibility','hidden');
    $('#sign-up').css('visibility','hidden')
}