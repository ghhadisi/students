<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>


      <script type="text/javascript" src="./jsp/js/namecheck1.js"></script>


      <script type="text/javascript">

      </script>
  </head>
  <body>
 <%--    <jsp:forward page="./jsp/student_list.jsp">
     </jsp:forward>--%>
 <a href="studetsSearch" >students</a> <br />

 <a href="./jsp/search.jsp" >搜索</a><br />

 <a href="dataJsonServlet" >dataJsonServlet</a><br />
 <a href="dataXmlServlet" >dataXmlServlet</a><br />
 <a href="listenerServlet" >listenerServlet</a><br />

 <form >

     <table>
         <tbody>
         <tr>
             <td>
                 name:
             </td>
             <td>
                 <input type="text" name="username"  id="username" onblur="checkNameExist()" onchange="checkNameExist()"/>
             </td>

             <td id="td_name_hint">

             </td>
         </tr>
         <tr>
             <td>
                 password:
             </td>
             <td>
                 <input type="password" name="password" />
             </td>
             <td>

             </td>
         </tr>
         </tbody>
     </table>
     <input type="submit" value="提交" />
 </form>
  </body>
</html>