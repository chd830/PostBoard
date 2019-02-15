'use strict';

$(document).ready(function () {
    //  $.post("/rest/list", function (result) {
    //         for(var i = 15; i < 30; i++) {
    //             console.log(result.list[i]);
    //         }
    // })
});

$(window).scroll(function () {
    var dh = $(document).height();
    var wh = $(window).height();
    var wt = $(window).scrollTop();
    var per = (wh + wt) / dh;
    if (per > 1) {
        console.log("per: "+per);
    }
})