package servlet;

import com.example.educationnwebapp.Student.entity.Student;
import com.example.educationnwebapp.Student.repo.Studentrepo;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Loginservlet", value = "/login")
public class Loginservlet extends HttpServlet {
    private final Studentrepo repo=new Studentrepo();
   @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      final Object loggedinuser = request.getSession().getAttribute("loggedinuser");
       if(loggedinuser!=null){
           response.sendRedirect(request.getContextPath()+"index");
       }
       request.getRequestDispatcher("login.jsp").forward(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        final List<Student> list = repo.getlist(null, null, email, null, null, password);
        if(!(list.isEmpty())){
            final Student student=list.get(0);
            request.getSession().setAttribute("loggedinuser",student);
        }
        response.sendRedirect("index");
    }
}