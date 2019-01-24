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
    <link href="css/bootstrap.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
    <script type="text/javascript" src="js/bootstrap.js" ></script>

    <meta name="viewport" content="width=device-width, initial-scale=1" />

</head>
<body>
<div   class="container">
    <div class="row page-header" style="text-align: center; ">
        <h1>学生管理系统</h1>
    </div>

    <div class="row" >

        <p class="col-md-1">姓名查询</p>
        <input type="text" class="col-md-2" id="sname"/>
        <p class="col-md-1">性别查询</p>

        <div class="btn-group col-md-2">
            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="width: 70%;">
                &nbsp;无&nbsp; <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu">
                <li><a href="#">男</a></li>
                <li><a href="#">女</a></li>
                <li><a href="#">无</a></li>
            </ul>
        </div>
        <input class="btn btn-default col-md-1 text-right" type="button" value="查询" id="btnsearch"/>&nbsp;&nbsp;
        <input class="btn btn-default col-md-1 text-right" type="button" value="添加" id="btnadd"/>
    </div>

    <div class="row">
        <table class="table table-bordered">
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
            <tr  class="text-center">
                <td>1</td>
                <td>3</td>
                <td>4</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
                <td>7</td>
                <td>8</td>
            </tr>
        </table>
    <div class="row">
</div>
</body>
</html>
