<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/6/19
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交作业</title>
</head>
<body>
<div style="align-self: center; padding-top: 20px">
    <form method="post" action="/submit/add">
        <fieldset>
            <legend>提交作业</legend>
            <br>
            id:<input type="text" name="id">
            <br/>
            student id: <input type="text" name="studentId">
            <br />
            homework id: <input type="text" name="homeworkId" />
            <br />
            homework title: <input type="text" name="title" />
            <br />
            homework content: <input type="text" name="homeworkContent" />
            <br />
            <input type="submit" value="Submit" />
        </fieldset>
    </form>
</div>

</body>
</html>
