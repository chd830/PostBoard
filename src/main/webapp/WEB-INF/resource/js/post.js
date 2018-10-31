'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

if (document.cookie != "cookie = ") {
    $('#log-out').css('visibility', 'visible');
}
var logoutBtn = document.getElementById("log-out");
logoutBtn.onclick = function () {
    document.cookie = "cookie = ";
    $('#log-out').css('visibility', 'hidden');
    location.replace("/");
}
