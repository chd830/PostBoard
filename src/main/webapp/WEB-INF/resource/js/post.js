$(document).ready(function() {
    $.get('/post/list',function(result) {
        for(var i=0;i<result.length;i++) {
            $('.testTitle').text(result[i].title);

            console.log(result[i].title);
        }

    })
})