'use strict';

$(document).ready(function () {
     $.post("/rest/list", function (result) {
            for(var i = 15; i < 30; i++) {
                console.log(result.list[i]);
            }
    })
});

//
// $(window).scroll(function () {
//     var dh = $(document).height();
//     var wh = $(window).height();
//     var wt = $(window).scrollTop();
//     if (dh == wh + wt) {
//         append_list();
//         console.log("check");
//
//     }
// })
//
// var start = 0;
// var list = 5;
// function append_list() {
//     $.post('/post/post_list',{start:start,list:list}, function(data) {
//         var num = document.getElementById("end").value;
//         if(num >= 15) {
//             $("#last").append(data);
//         }
//     })
// }
//
// // setInterval(function () {
// //     if (didScroll) {
// //         didScroll = false;
// //         $('.scroll').attr('style','visibility:visible');
// //         console.log("scrolled");
// //     }
// // }, 750);