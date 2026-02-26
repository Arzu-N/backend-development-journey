<%@ page import="Util.Paramutil" %>
<%@ page import="com.example.educationnwebapp.Student.repo.Studentrepo" %>
<%@ page import="com.example.educationnwebapp.Student.entity.Student" %><%--
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
    <title>update</title>
</head>
<body>
<% Integer id = Paramutil.Parseint(request.getParameter("id"));
    Studentrepo repo=new Studentrepo();
    Student found = repo.findbiyid(id);
%>
<form class="container g-0" action="index" method="POST">
        <div class="row  col-5">
            <label for="name" class="form-label">name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name" value="<%=found.getName()%>">
        </div>
        <div class="row  col-5">
            <label for="surname" class="form-label">surname</label>
            <input type="text" class="form-control" id="surname" name="surname" placeholder="surname" value="<%=found.getSurname()%>">
        </div>
        <div class="row  col-5">
            <label for="age" class="form-label">age </label>
            <input type="number" class="form-control" id="age" name="age" placeholder="age" value="<%=found.getAge()%>">
        </div>
        <div class="row  col-5">
            <label for="email" class="form-label">email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="email" value="<%=found.getEmail()%>">
        </div>
        <div class="row  col-5">
            <label for="university" class="form-label">university</label>
            <select name="university" class="form-select" id="university">
                <option value="AZTU" <%=(found.getUniversity().equalsIgnoreCase("AZTU"))?"selected":""%> >AZTU</option>
                <option value="BDU" <%=(found.getUniversity().equalsIgnoreCase("BDU"))?"selected":""%>>BDU</option>
                <option value="AU" <%=(found.getUniversity().equalsIgnoreCase("AU"))?"selected":""%>>AU</option>
                <option value="BSU" <%=(found.getUniversity().equalsIgnoreCase("BSU"))?"selected":""%>>BSU</option>
            </select>
        </div>
    <input type="hidden" name="id" value="<%=found.getId()%>">
        <input type="hidden" name="command" value="update">
    <div class="row">
        <div class="col-2"> <button type="submit" class="btn btn-primary mb-3">save</button></div>
    </div>
</form>
</body>
</html>
