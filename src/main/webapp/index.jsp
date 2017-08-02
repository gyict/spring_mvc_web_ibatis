<%--
  Created by IntelliJ IDEA.
  User: maicius
  Date: 2017/3/31
  Time: 下午6:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Functions</title>
</head>
<body>
<form action="userLogin.action" method="post">
    <input type="text" name="username" placeholder="用户名"/>
    <input type="password" name="password" placeholder="密码" />
    <input type="submit" about="登陆"/>

</form>


<form action="/userShow.action" method="post">

    <input type="submit" value="查看所有用户"/>

</form>

<a href = "add.jsp" type = "button" >注册</a>
<a href = "delete.jsp" type = "button">删除</a>
<a href = "update.jsp" type = "button">修改</a>

<a href = "notesAdd.jsp" type = "button" >注册</a>
<a href = "delete.jsp" type = "button">删除</a>
<a href = "update.jsp" type = "button">修改</a>




</body>
</html>
