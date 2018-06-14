$(function() {

    $('#btn').click(function() {

        /* Ajax post */
        var Start = $("#start").val();
        var  End=$('#end').val();
        var  Company=$('#company').val();
        var Level=$("input[name='group']:checked").val();
        var Time=$('#time').val();
        $.post("http://localhost:8080/book/select", {
            start:Start,
            end:End,
            company:Company,
            level:Level,
            time:Time
        }, function(data) {

            if(data!="0")
            {
                var data1=JSON.parse(data);
                id1=data1.id;
                money=data1.money;
                alert("预定成功，即将进入付款界面");
                window.location.href("zhifu.html?user="+username+"&money="+money+"&company="+Company+"&id="+id1);
            }
            else
            {
                alert("该航空公司没有出售该时段的票！")
            }
        });
    });

});

