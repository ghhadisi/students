<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-1-25
  Time: 上午10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="error.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/bootstrap.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
    <script type="text/javascript" src="js/bootstrap.js" ></script>

    <meta name="viewport" content="width=device-width, initial-scale=1" />

</head>
<body>
    <form action="/studentUpdate" method="post">

        <table class="table table-bordered" >
            <thead class="text-center">
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
            <td>生日</td>
            <td>爱好</td>
            <td>简介</td>

            </thead>
            <tr>
                <td>
                    <input type="text" name="sid" value=" <c:if test='${stu != null}'>${stu.sid}</c:if>" >

                    </input>
                </td>
                <td>
                    <input type="text" name="sname" value=" <c:if test='${stu != null}'>${stu.sname}</c:if>" >
                    </input>
                </td>
                <td>
                    <input type="text" name="gender" value=" <c:if test='${stu != null}'>${stu.gender}</c:if>" >
                    </input>
                </td>

                <td>
                    <input type="text" name="phone" value=" <c:if test='${stu != null}'>${stu.phone}</c:if>">
                    </input>
                </td>

                <td>
                    <input type="text" name="birthday" value=" <c:if test='${stu != null}'>${stu.birthday}</c:if>">
                    </input>
                </td>

                <td>
                    <input type="text" name="hobby" value=" <c:if test='${stu != null}'>${stu.hobby}</c:if>">
                    </input>
                </td>

                <td>
                    <input type="text" name="info" value=" <c:if test='${stu != null}'>${stu.info}</c:if>">
                    </input>
                </td>


            </tr>
        </table>

        <input class="btn btn-default" type="submit" value="Submit">

    </form>
</body>
</html>
