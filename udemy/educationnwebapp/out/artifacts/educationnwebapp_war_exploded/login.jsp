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
    <title>login</title>
</head>
<body>
<form class="container g-0" action="login" method="POST">
        <div class="row  col-5">
            <label for="email" class="form-label">email</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="email" >
            <label for="password" class="form-label">password</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="password" >
        </div>

    <div class="row">
        <div class="col-2"> <button type="submit" class="btn btn-primary mb-3">login</button></div>
    </div>
</form>
</body>
</html>
