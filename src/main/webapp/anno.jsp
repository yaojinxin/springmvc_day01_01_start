<%--
  Created by IntelliJ IDEA.
  User: 63495
  Date: 2021/4/25
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/anno/testRequestParam?name=张三">测试testRequestParam</a><br/>

<form action="/anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="username"><br/>
    用户年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交">
</form>

<a href="/anno/testPathVariable/10">测试PathVariable</a><br/>
<a href="/anno/testRequestHeader">测试RequestHeader</a><br/>
<a href="/anno/testCookieValue">测试CookieValue</a><br/>

    <form action="/anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname"><br/>
        用户年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form><br/>
<a href="/anno/testSessionAttribute">测试SessionAttribute</a>





</body>
</html>
