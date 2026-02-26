package com.example.servletApp;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException, ServletException{
     HttpSession session=req.getSession(false);
     String username=(session==null)?null:(String)session.getAttribute("username");
     String password=(session==null)?null:(String)session.getAttribute("password");
     if(username==null||password==null|| !username.equals("Arzu Nusratova") || !password.equals("admin")){
         resp.sendRedirect("login.html");
         return;
     }
     req.setAttribute("username",username);
     RequestDispatcher dispatcher=req.getRequestDispatcher("/home.jsp");
     dispatcher.forward(req,resp);

    }
}
