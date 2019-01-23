'use strict'


$('#save').click(function () {
    var title = $('#title').val();
    var content = $('#content').val();
    $.get('/rest/write', {
        title: title,
        content: content
    }, function (result) {
        if (!result) {
            alert("Registration Failed");
        }
        else {
            alert("Registration Success");
        }
        location.replace("/board");
    });
});
