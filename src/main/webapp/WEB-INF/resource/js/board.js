'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
$('#writeBtn').click(function() {
    location.replace('/write');
});
$(document).ready(function() {
    $.get('/rest/board',function(result) {
        $('.cardOneTitle').text(result[0].title);
        $('.cardOneContent').text(result[0].content);
        $('.cardTwoTitle').text(result[1].title);
        $('.cardTwoContent').text(result[1].content);
        $('.cardThreeTitle').text(result[2].title);
        $('.cardThreeContent').text(result[2].content);
    })
});
$('#log-out').click(function() {
    $('#log-out').css('visibility', 'hidden');
    location.replace("/");
})