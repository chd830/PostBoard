'use strict';

$(document).ready(function () {
    $.get('/rest/board', function (result) {
        $('.list').each(function (index) {
            console.log(result[index].title);
            $(this).text(result[index].title);
        })
    })
})