<%@ page import="com.example.educationnwebapp.Student.repo.Studentrepo" %>
<%@ page import="com.example.educationnwebapp.Student.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="Util.Paramutil" %>
<!DOCTYPE html>
<html style="height:100%;margin:0" lang="az">
<head>
    <meta charset="UTF-8">
    <title>ana sehife</title>
    <link rel="stylesheet" href="CSS/index.css">

    <style> #idd {
        text-align: left;
    }
    </style>
</head>
<body style="height:100%;margin:0">
<h1 style="text-align:left">Student</h1>
<% final String name = Paramutil.get(request.getParameter("name"));
    final String surname = Paramutil.get(request.getParameter("surname"));
    final String email = Paramutil.get(request.getParameter("email"));
    final Integer age = Paramutil.Parseint(request.getParameter("age"));
    final String university = Paramutil.get(request.getParameter("university"));
%>
<form class="container g-0" method="get">
    <div class="row">
        <div class="col-2">
            <label for="name" class="form-label">name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="name" value="<%=name%>">
        </div>
        <div class="col-2">
            <label for="surname" class="form-label">surname</label>
            <input type="text" class="form-control" id="surname" name="surname" placeholder="surname"
                   value="<%=surname%>">
        </div>
        <div class="col-2">
            <label for="age" class="form-label">age </label>
            <input type="number" class="form-control" id="age" name="age" placeholder="age"
                   value="<%=(age!=null)?age:""%>">
        </div>
        <div class="col-2">
            <label for="email" class="form-label">email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="email" value="<%=email%>">
        </div>
        <div class="col-2">
            <label for="university" class="form-label">university</label>
            <select name="university" class="form-select" id="university">
                <option value="AZTU"<%=university != null && university.equals("AZTU") ? "selected" : ""%> >AZTU</option>
                <option value="BDU"<%=university != null && university.equals("BDU") ? "selected" : ""%> >BDU</option>
                <option value="AU"<%=university != null && university.equals("AU") ? "selected" : ""%> >AU</option>
                <option value="BSU"<%=university != null && university.equals("BSU") ? "selected" : ""%> >BSU</option>
            </select>
        </div>
    </div>
    <div class="row">
        <div class="col-1">
            <button type="submit" class="btn btn-primary mb-3">search</button>
        </div>
        <div class="col-1"><a type="submit" class="btn btn-primary mb-3" href="insert.jsp">insert</a>
        </div>

    </div>
</form>

<table class="table" id="idd" style=" background-color: #f5ff8b;width:100%">
    <thead>
    <tr>
        <th>ID</th>
        <th>name</th>
        <th>surname</th>
        <th>age</th>
        <th>email</th>
        <th>university</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>

    <% List<Student> list = (List<Student>) request.getAttribute("list");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
    %>
    <tr <%= (i % 2 == 0) ? "class=\"table-secondary\"" : " "%>>
        <td><%= student.getId()%>
        </td>
        <td><%= student.getName()%>
        </td>
        <td><%= student.getSurname()%>
        </td>
        <td><%= student.getAge()%>
        </td>
        <td><%= student.getEmail()%>
        </td>
        <td><%= student.getUniversity()%>
        </td>
        <td><a href="delete.jsp?id=<%=student.getId()%>" class="btn btn-danger">Delete</a>
            <a href="update.jsp?id=<%=student.getId()%>" class="btn btn-info">Update</a>
        </td>

    </tr>
    <%}%>
    </tbody>
</table>

</body>

</html>