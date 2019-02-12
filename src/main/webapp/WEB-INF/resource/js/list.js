'use strict';

$(document).ready(function () {
     $.post("/rest/list", function (result) {
            console.dir(result.list);
            for(var i = 0; i<result.list.length; i++) {
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

var page = 1;
$(function () {
    getList(page);
    page++;
});

$(window).scroll(function () {
    if ($(window).scrollTop() >= $(document).height - $(window).height()) {
        getList(page);
        page++;
    }
});

function getList() {
    $.ajax({
        type: 'POST',
        dataType: 'json',
        data: {"page": page},
        success: function (returnData) {
            var data = returnData.rows;
            var html = "";
            if (page == 1) { //페이지가 1일경우에만 id가 list인 html을 비운다.
                $("#list").html("");
            }
            if (returnData.startNum <= returnData.totCnt) {
                if (data.length > 0) {
                    // for문을 돌면서 행을 그린다.
                } else {
                    //데이터가 없을경우
                }
            }
            html = html.replace(/%20/gi, " ");
            if (page == 1) {  //페이지가 1이 아닐경우 데이터를 붙힌다.
                $("#list").html(html);
            } else {
                $("#busStopList").append(html);
            }
        }, error: function (e) {
            if (e.status == 300) {
                alert("데이터를 가져오는데 실패하였습니다.");
            }
            ;
        }
    });
}
