<%--
  Created by IntelliJ IDEA.
  User: ssdeepin
  Date: 19-1-26
  Time: 下午7:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="./js/jquery-1.11.0.js" >

    </script>

    <script type="text/javascript">
        $(function () {

            console.log("init")
            $("#divAbout").hide()

            $("#btnSearch").click(function () {
                console.log("btnSearch")
                $("#divAbout").show()
            })
            
            $("#textContent").keyup(function () {
                var key = $("#textContent").val().trim()


                if (key == ""){
                    $("#divAbout").hide()
                    return
                }
                $.post("/keyWordsServlet",{
                    "keyword":key
                },function (data ,status) {
                    $("#divAbout").show()
                    $("#divAbout").html(
                        data
                    )

                })
            })
        })


        // function searchWords() {
        //     $.post()
        // }
    </script>

</head>
<body>

    <input type="text" style="width:500px; margin-left: 20%; margin-right: 50px; margin-top: 10%" id="textContent"/>
    <input type="button" value="搜索" id="btnSearch" />

    <div id="divAbout" style="width: 500px; margin-left: 20%">
    </div>

</body>
</html>
