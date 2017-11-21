<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>你好，世界！！！！</h1>
<div>
    <f:input path="name"/>
    <f:form method="post" action="#">
        <table>
            <tr>
                <td>name:</td>
                <td><f:input path="username"/></td>
            </tr>
            <tr>
                <td>email:</td>
                <td><f:input path="email"/></td>
            </tr>
            <tr>
                <td>password：</td>
                <td><f:password path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><f:textarea path="id" rows="5" cols="21.9"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Start"></td>
            </tr>
        </table>
    </f:form><br>
</div>

<script src="../js/jquery-1.11.js"></script>
<script src="../js/bootstrap.min.js"></script>
</body>
</html>