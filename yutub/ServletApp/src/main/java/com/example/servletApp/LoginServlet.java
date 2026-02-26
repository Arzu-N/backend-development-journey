package com.example.servletApp;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
        String username = req.getParameter("username");
        String password=req.getParameter("password");
        HttpSession session=req.getSession();
        session.setAttribute("username",username);
        session.setAttribute("password",password);
        resp.sendRedirect("home");
    }
}
