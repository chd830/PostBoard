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
        $('.block').append('<table></table>');
        var table = $('.block').children();

        for(var i = 0; i < 3; i++) {
            table.append('<td class = "cell">' + result[i].title + '</td>');
        }

        table.append('<tr>');
        for(var i = 0; i < 3; i++) {
            table.append('<td class = "cell">' + result[i].content + '</td>');
        }
        table.css("width","100%");
        table.css("font-size","45px");
        $('.cell').css("width","33%");
    })
});


$('#log-out').click(function () {
    document.cookie = "cookie=";
    location.replace("/");
})