'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
document.getElementById("sign-in").onclick = function () {
    location.replace('/');
    // window.open("/","width=500px,hegith=500px");
    // window.focus();
}
document.getElementById("sign-up").onclick = function() {
    window.open("/signup", "", "width=500px,height=500px");
    window.focus();
}