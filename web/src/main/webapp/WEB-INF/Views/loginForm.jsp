<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/23
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form method="post" action="/login">
        <font style="color: red">${requestScope.msg}</font>
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" id="username" name="username"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" id="password"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
