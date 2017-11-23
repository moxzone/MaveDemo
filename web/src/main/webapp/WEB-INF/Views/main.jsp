<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/23
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<html>
<head>
    <title>登录跳转页面</title>
</head>
<body>
    <table>
        <tr>
            <td></td>
            <td>欢迎[${sessionScope.user.username}]登录成功~</td>
        </tr>
        <tr>
            <td>Email:</td>
            <td>${sessionScope.user.email}</td>
        </tr>
    </table>
</body>
</html>
