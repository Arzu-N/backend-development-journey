<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>
Login
</title>
</head>
<body>
<form method="post" action="login">
<input type="text" name="username" id ="name" placeholder="username" required>
<input type="password" name="password" id="password" placeholder="parol" required>
<button type="submit">Daxil ol</button>
<p><a href="logout">Logout</a></p>
<c:if test="${not empty error}">
<p style="color:red">${error}</p>
</c:if>
</form>
</body>
</html>