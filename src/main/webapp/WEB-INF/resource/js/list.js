'use strict';
var dh;
var wh;
var wt;
var max;
var next = 0;
$(document).ready(function () {
    dh = $(document).height();
    wh = $(window).height();
    wt = $(window).scrollTop();
    max = (wh + wt) / dh;


})

function appendList() {
    $.post("/rest/list", function (result) {
        var text = $('#userName').text();
        for (var i = 20 + next; i < 39 + next && i < result.list.length; i++) {
            var last = $('#table:last-child')
            last.append('<tr>');
            last.append('<th>'+i);
            last.append('<th>'+result.list[i].title);
            last.append('<th>'+text);
            last.append('<th>'+result.list[i].updateDate);
        }
        next = next + 20;

    })
}

$(window).scroll(function () {
    dh = $(document).height();
    wh = $(window).height();
    wt = $(window).scrollTop();
    var per = (wh + wt) / dh;
    if ((max + 0.1) < per) {
        appendList();
        max = per;
    }
})