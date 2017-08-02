<%--
  Created by IntelliJ IDEA.
  User: gaoyuan
  Date: 17/7/17
  Time: 下午8:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer</title>
</head>
<body>
<form action="transfer.action" method="post">
    <input type="text" name="to" placeholder="收款方"/>
    <input type="text" name="from" placeholder="付款方" />
    <input type="text" name="money" placeholder="钱数" />
    <input type="submit" about="确定交易"/>

</form>
</body>
</html>
