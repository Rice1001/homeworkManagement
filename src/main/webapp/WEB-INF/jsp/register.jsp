<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/6/19
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div>
    <div>
        <form id="register" style="text-align: center" action="/register" method="post">
            &nbsp;&nbsp;&nbsp;id: <input type="text"  name="id"><br>
            name: <input type="text" name="name"><br>
            password: <input type="text"  name = "password"/><br>
            <input type="radio" name = "user" value="teacher" />教师&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type = "radio" name = "user" value="student" />
            学生<br><input type="submit"  value = "确定"/>
        </form>
    </div>
</div>
</body>
</html>
