<%--
  Created by IntelliJ IDEA.
  User: 63495
  Date: 2021/5/3
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/mav/testVO" method="post">
        <input type="text" name="users[0].uname"><br/>
        <input type="text" name="users[0].age"><br/>
        <input type="text" name="users[1].uname"><br/>
        <input type="text" name="users[1].age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
