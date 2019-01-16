'use strict';

$(document).ready(function () {
    $.get('/rest/board', function (result) {
        $('.list').each(function (index) {
            console.log(result[index].title);
            $(this).text(result[index].title);
        })
    })
    $.post("/post/post_list", function (result) {
            console.dir(result);
    })
});


$(window).scroll(function () {
    var dh = $(document).height();
    var wh = $(window).height();
    var wt = $(window).scrollTop();
    if (dh == wh + wt) {
        console.log("check");

    }
})

// setInterval(function () {
//     if (didScroll) {
//         didScroll = false;
//         $('.scroll').attr('style','visibility:visible');
//         console.log("scrolled");
//     }
// }, 750);
