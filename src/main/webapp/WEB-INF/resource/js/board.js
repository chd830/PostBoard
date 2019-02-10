'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

$('#writeBtn').click(function () {
    location.replace('/post/write');
});

$(document).ready(function () {
    $('.block').css("width", "100%");
    var count = 0 ;
    var num = 0;
    for (var i = 0; i < 3; i++) {
        $('.block').append('<div class="post"></div>');
    }
    $('.post').append('<p></p><p></p>');
    $.get('/rest/board', function (result) {
        $('p').each(function() {
            if(count%2 == 0) {
                $(this).text(result[num].title);
                count++;
            }
            else if(count%2 == 1) {
                $(this).text(result[num++].content);
                count++;
            }
        })
    });
});


$('#log-out').click(function () {
    document.cookie = "cookie=";
    location.replace("/");
})