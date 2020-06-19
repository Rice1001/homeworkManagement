<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/6/19
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加作业</title>
</head>
<body>
<div style="align-self: center;padding-top: 20px">
    <form method="post" action="/homework/add">
        <fieldset>
            <legend> 添加作业</legend>
            <br>
            homework id: <input type="text" name="id" />
            <br />
            homework title: <input type="text" name="title" />
            <br />
            homework content: <input type="text" name="content" />
            <br />
            <input type="submit" value="Submit" />
            <br>
        </fieldset>
    </form>
</div>
</body>
</html>
