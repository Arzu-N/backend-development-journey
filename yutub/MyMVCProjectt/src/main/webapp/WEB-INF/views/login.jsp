<%@ page contentType="text/html;charset=UTf-8"%>
<html>
<head>
<title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="login">
<input type="text" name="username" placeholder="Istifadeci adi" required/><br>
<input type="password" name="password" placeholder="parol" required/><br>
<button type="submit">Daxil ol</button>
</form>
<c:if test="${not empty error}">
<p style="color:red;">${error}</p>
</c:if>
<c:if test="${not empty message}">
<p style="color:green;">${message}</p>
</c:if>
<a href="register">Qeydiyyat</a>
</body>
</html>