
<%@ page import="com.example.education.Console.EducationRestClient" %>
<%@ page import="com.example.education.Console.CommonResponse" %>
<%@ page import="com.example.education.Console.StudentResponse" %>
<% CommonResponse response1 = EducationRestClient.getstudentsfromapi();
for(StudentResponse student:response1.getObj()){%>
<table>
    <tbody>
    <tr>student.getEmail</tr>
    </tbody>
</table>
<%
}
%>