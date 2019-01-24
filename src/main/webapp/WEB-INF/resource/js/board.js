'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

$('#writeBtn').click(function () {
    location.replace('/post/write');
});

$(document).ready(function () {
    var count = 0;
    $.get('/rest/board', function (result) {
        $('.table').append('<table></table>');
        var table = $('.table').children();
        for (; count < 3; count++) {
            table.append('<tr><td>' + result[count].title + '</td>');
            table.append('<tr><td>' + result[count].content + '</td>');
            console.log("title: "+result[count].title);
            console.log("content: "+result[count].content);
        }
    })

});
$('#log-out').click(function () {
    document.cookie = "cookie=";
    location.replace("/");
})