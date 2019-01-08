'use strict';

$(document).ready(function () {
    $.get('/rest/board', function (result) {
        // for(var i=0;i<result.length;i++)
        //     console.log(result);
        //     $('ol li:nth-child(i)').text(result[i].title);
        $('.list').each(function (index) {
            console.log(result[index].title);
            $(this).text(result[index].title);
        })

        // $('#one').text(result[0].title);
        // $('#two').text(result[1].title);
    })
})