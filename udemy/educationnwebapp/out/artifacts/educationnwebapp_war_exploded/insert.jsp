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
    <title>insert</title>
</head>
<body>
<form class="container g-0" action="index" method="POST">
        <div class="row  col-5">
            <label for="name" class="form-label">name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name" >
        </div>
        <div class="row  col-5">
            <label for="surname" class="form-label">surname</label>
            <input type="text" class="form-control" id="surname" name="surname" placeholder="surname">
        </div>
        <div class="row  col-5">
            <label for="age" class="form-label">age </label>
            <input type="number" class="form-control" id="age" name="age" placeholder="age">
        </div>
        <div class="row  col-5">
            <label for="email" class="form-label">email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="email">
        </div>
        <div class="row  col-5">
            <label for="university" class="form-label">university</label>
            <select name="university" class="form-select" id="university">
                <option value="AZTU" >AZTU</option>
                <option value="BDU" >BDU</option>
                <option value="AU" >AU</option>
                <option value="BSU" >BSU</option>
            </select>
        </div>
        <input type="hidden" name="command" value="insert">
    <div class="row">
        <div class="col-2"> <button type="submit" class="btn btn-primary mb-3">save</button></div>
    </div>
</form>
</body>
</html>
