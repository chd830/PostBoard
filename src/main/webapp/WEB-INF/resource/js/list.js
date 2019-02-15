'use strict';
var dh;
var wh;
var wt;
var max;
$(document).ready(function () {
    dh = $(document).height();
    wh = $(window).height();
    wt = $(window).scrollTop();
    max = (wh + wt) / dh;
})

function appendList() {
    $.post("/rest/list", function (result) {
        for (var i = 25; i < 49; i++) {
            $('#table:last-child').append('<tr><th id="row"></th><th id="title"></th><th id="userName"></th><th id="updateDate"></th>');
        }
    })
}

$(window).scroll(function () {
    dh = $(document).height();
    wh = $(window).height();
    wt = $(window).scrollTop();
    var per = (wh + wt) / dh;
    if (max < per) {
        appendList();
        console.log("per: " + per);
        max = per;
    }
})