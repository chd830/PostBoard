'use strict'


$('#save').click(function() {
    var title = $('#title').val();
    var content = $('#content').val();
    $.get('/post/rest/write', {
        // userId: window.cookie,
        title: title,
        content: content
    },function() {
        location.replace("/board");
    });
});
