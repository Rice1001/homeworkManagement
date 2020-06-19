<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/6/18
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<div style="padding-top: 80px">
    <form method="post" action="/login" style="text-align: center;padding-top: 20%;">
        username: <input type="text" name = "id"><br>
        password: <input type="text" name = "password"><br>
        <input type="radio" name = "user" value="teacher" checked="checked"/>教师&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "radio" name = "user" value="student" />
        学生<br><input type="submit" value="登录">&nbsp;&nbsp;&nbsp;<a href="/registerPage" >注册</a>
    </form>&nbsp;
</div>

</body>
</html>
