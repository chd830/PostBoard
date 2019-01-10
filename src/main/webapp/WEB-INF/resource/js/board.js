'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

$('#writeBtn').click(function () {
    location.replace('/post/write_post');
});

$(document).ready(function () {
    var count = 0;
    $.get('/rest/board', function (result) {
        $('.post').each(function (index) {
            var title = result[count].title;
            var content = result[count].content;

            if (index % 2 == 0) {
                $(this).text(title);

            }
            else if (index % 2 == 1) {

                $(this).text(content);
                count += 1;
            }
            sessionStorage.post = JSON.stringify({result: [result]});
        })
    })
});
$('#log-out').click(function () {
    document.cookie = "cookie=";
    location.replace("/");
})