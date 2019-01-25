<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-1-24
  Time: 下午3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" errorPage="./error.jsp" %>
<html>
<head>
    <title>Title</title>
    <link href="/jsp/css/bootstrap.css" rel="stylesheet" />
    <script type="text/javascript" src="/jsp/js/jquery-1.11.0.js" ></script>
    <script type="text/javascript" src="/jsp/js/bootstrap.js" ></script>

    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <script type="text/javascript" >

        $(function () {
            // $(".btnDelete").click(function () {
            //
            //     var flag = confirm("是否确定删除?");
            // })
        })

        function addStudent() {
            console.log("btnadd")
            window.location.href="./jsp/student_update.jsp"
            if(flag){
                //表明点了确定。 访问servlet。 在当前标签页上打开 超链接，
                //window.location.href="DeleteServlet?sid="+sid;
                // location.href="DeleteServlet?sid="+sid;
            }
        }

        function deleteStu(sid) {
            var flag = confirm(sid +"是否确定删除?");
            if (flag){

                location.href="studetDelete?sid="+sid;

            }
        }

    </script>
</head>
<body>
<div   class="container">
    <div class="row page-header" style="text-align: center; ">
        <h1>学生管理系统</h1>
    </div>

    <form class="row" style="width: 100%" method="post" action="studetsSearch">

        <p class="col-md-1">姓名查询</p>
        <input type="text" class="col-md-2" name="sname"/>
        <p class="col-md-1">性别查询</p>

        <select class="btn-group col-md-2" name="sgender">
            <option value="">--请选择--</option>
            <option value="男">男</option>
            <option value="女">女</option>
        </select>

        <div class="col-md-1"></div>

        <input class="btn btn-default col-md-1 text-right" type="submit" value="查询" id="btnsearch"/>
        <div class="col-md-1"></div>

        <input class="btn btn-default col-md-1 text-right" type="button" value="添加" id="btnadd" onclick="addStudent()"/>
    </form>

    <div class="row">
        <table class="table table-bordered" style="width: 100%">
            <thead class="text-center">
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>电话</td>
                <td>生日</td>
                <td>爱好</td>
                <td>简介</td>
                <td>操作</td>
            </thead>

            <c:forEach var="stu" items="${list}">

                <tr  class="text-center">
                    <td>${stu.sid }</td>
                    <td>${stu.sname }</td>
                    <td>${stu.gender }</td>
                    <td>${stu.phone }</td>
                    <td>${stu.birthday }</td>
                    <td>${stu.hobby }</td>
                    <td>${stu.info }</td>
                    <td >
                        <a href="/studentDetail?sid=${stu.sid}">修改</a>
                        <input type="button"  class="btn btn-danger btnDelete" onclick="deleteStu(${stu.sid})" value="删除"/>
                    </td>
                </tr>
            </c:forEach>

        </table>
    <div class="row">
</div>
    </div>
</div>
</body>
</html>
