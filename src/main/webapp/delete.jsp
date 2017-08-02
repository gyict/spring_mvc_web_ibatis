<%--
  Created by IntelliJ IDEA.
  User: gaoyuan
  Date: 17/7/12
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Someone</title>
</head>
<body>
<form action="/userDelete.action" method="post">
    <input type="text" name="username" placeholder="需要删除的用户名"/>
    <input type="submit" about="确定"/>
</form>
