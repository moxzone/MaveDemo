<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" isErrorPage="true" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>Exception</title>
</head>
<body>
    <%--<h3><%=exception.getClass().getName() %></h3><br>--%>
    <%--<h3><%=exception.getClass().getCanonicalName() %></h3><br>--%>
    <%--<h3><%=exception.getClass().getSimpleName() %></h3><br>--%>
    <%--<br><br><br>--%>
    <h4><%=exception.getLocalizedMessage().split("\n")[0]%></h4>
</body>
</html>
