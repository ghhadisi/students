<%--
  Created by IntelliJ IDEA.
  User: ssdeepin
  Date: 19-1-26
  Time: 下午10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
    <c:forEach items="${list}" var="str">
        <tr>
            <td>
                ${str}
            </td>
        </tr>

    </c:forEach>
</table>