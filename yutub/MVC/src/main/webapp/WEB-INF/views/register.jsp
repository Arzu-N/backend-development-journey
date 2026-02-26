<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Qeydiyyat</title>
</head>
<body>
<form method="post" action="register">
<input type="text" name="username" id="name" placeholder="username" required><br>
<input type="password" name="password"  placeholder="parol" required>
<button type="submit">Qeydiyyatdan kec</button>
</form>
<c:if test="${not empty error}">
<p style="color:red">${error}</p>
</c:if>
</body>
</html>