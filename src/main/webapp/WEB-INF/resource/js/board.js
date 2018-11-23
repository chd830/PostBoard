'use strict'
history.pushState(null, null, location.href);
window.onpopstate = function (event) {
    history.go(1);
};
$('#writeBtn').click(function() {
    location.replace('/write');
});
$(document).ready(function() {
    console.log(document.cookie);
    $.get('/rest/board',function(result) {
        console.dir(result);
        if(result.length>0){
            $('.cardOneTitle').text(result[0].title);
            $('.cardOneContent').text(result[0].content);
        }
        if(result.length>1) {
            $('.cardTwoTitle').text(result[1].title);
            $('.cardTwoContent').text(result[1].content);
        }
        if(result.length>2) {
            $('.cardThreeTitle').text(result[2].title);
            $('.cardThreeContent').text(result[2].content);
        }
    })
});
$('#log-out').click(function() {
    location.replace("/");
})