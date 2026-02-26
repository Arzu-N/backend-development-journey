<%--
  Created by IntelliJ IDEA.
  User: Arzu
  Date: 09.09.2025
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="CSS/index.css">
    <title>delete</title>
</head>
<body>
<form action="index" method="POST">
    Are you sure to delete?
<input type="hidden" name="id" value="<%=request.getParameter("id")%>">
    <input type="hidden" name="command" value="delete">
    <button class="btn btn-primary" type="submit">YES</button>
    <a href="index.jsp" class="btn btn-danger">NO</a>
</form>
</body>
</html>
