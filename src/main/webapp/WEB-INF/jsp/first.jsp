<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/6/19
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生主页</title>
    <link rel="stylesheet" type="text/css" href="css/studentPage.css" />
</head>
<body>
    <div>
        <ul class="topnav">
            <li><a class="active" href="/homework/findAll" target="container">查看作业</a></li>
            <li><a href="/submitPage" target="container">提交作业</a></li>
            <li><a href="/updatePage" target="container">更新作业</a></li>
            <li class="right"><a href="/">退出</a></li>
        </ul>
    </div>

    <div id="container">
        <iframe name="container" style="height: 100%; width:100%"></iframe>
    </div>

</body>
</html>
