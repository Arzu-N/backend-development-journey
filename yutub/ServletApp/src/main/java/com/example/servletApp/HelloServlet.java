package com.example.servletApp;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.IOException.*;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<form action=\"/action_page.php\">\n"+
                "<label for=\"fname\">First name:</label>\n"+
                "<input type=\"text\" id=\"fname\" name=\"fname\"><br><br>\n"+
                "<label for=\"lname\"> Last name: </label>\n"+
                "<input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n"+
                "<input type=\"submit\" value=\"Submit\" >\n"+
                "/form>");
    }
}
