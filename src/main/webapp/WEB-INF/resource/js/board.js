'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};

$('#writeBtn').click(function() {
    location.replace('/post/write');
});

$('.card-body').click(function() {
    location.replace('/post');
});

$(document).ready(function() {
    var count = 0;
    $.get('/rest/board',function(result) {
        $('.post').each(function(index) {
            if(index%2 == 0 ) {
                $(this).text(result[count].title);
            }
            else if(index%2 == 1) {
                $(this).text(result[count].content);
                count+=1;
            }
        })
    })
});
$('#log-out').click(function() {
    document.cookie = "cookie=";
    location.replace("/");
})