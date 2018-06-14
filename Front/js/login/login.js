$(
    function () {
        $(document).ready(
            function()
            {
                $(function() {

                    /* Ajax post */
                    $('#submitbt').click(function() {
                        var Username = $("#username").val();
                        var  Password=$("#password").val();
                        $.post("http://localhost:8080/login/valid", {
                            username : Username,
                            password  :   Password
                        }, function(data) {
                            if(data!="0")
                            {
                                if(data=="1")
                                {
                                    window.location.href="booking.html?username="+Username+"&password="+Password
                                }
                                if(data=="2")
                                {
                                    window.location.href="admin.html?username="+Username+"&password="+Password
                                }

                            }
                            else{
                                alert("登录失败,求重新登录");
                                window.location.href=window.location;
                            }
                        });
                    });
                    /* Ajax post */
                });

            }

        );
    }

)