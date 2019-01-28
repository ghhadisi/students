<%@ page import="com.hss.student.listener.active.TeacherBindingBean" %><%--
  Created by IntelliJ IDEA.
  User: acerdeepin
  Date: 19-1-28
  Time: 下午5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    
    <script type="text/javascript">
        function  addAttr() {
        }
        
        
        function attrRemove() {
            
        }
        
        
        function attReplace() {
            
        }
    </script>


</head>
<body>


<% session.setAttribute("aaa","bbb"); %>

<% session.setAttribute("aaa","ccc"); %>
<% session.removeAttribute("aaa"); %>


<% TeacherBindingBean teacherBindingBean = new TeacherBindingBean();
    teacherBindingBean.setName("zhangsan");
    session.setAttribute("teacher", teacherBindingBean);
%>

    <input type="button" onclick="addAttr()" value="add attr"/> <br />
    <input type="button" onclick="attrRemove()" value="attr remove"/> <br />

    <input type="button" onclick="attReplace()" value="attr replace"/> <br />

</body>
</html>
