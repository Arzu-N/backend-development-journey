<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Login</title></head>
<body>
<h2>Login</h2>
<form method="post" action="/login">
    <input type="text" name="username" placeholder="İstifadəçi adı" required/><br/>
    <input type="password" name="password" placeholder="Şifrə" required/><br/>
    <button type="submit">Daxil ol</button>
</form>
<c:if test="${not empty error}">
    <p style="color:red;">${error}</p>
</c:if>
<p><a href="register">Qeydiyyat</a></p>
</body>
</html>
