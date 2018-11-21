'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
var logoutBtn = document.getElementById("log-out");
logoutBtn.onclick = function () {
    location.replace('/');
}
var writeBtn = document.getElementById("writeBtn");
writeBtn.onclick = function() {
    location.replace('/write');
}
