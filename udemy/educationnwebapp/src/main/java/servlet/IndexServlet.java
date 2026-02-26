package servlet;

import Util.Paramutil;
import com.example.educationnwebapp.Student.entity.Student;
import com.example.educationnwebapp.Student.repo.Studentrepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="indexSevlet",value="/index")
public class IndexServlet extends HttpServlet {
    private final Studentrepo repo=new Studentrepo();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String name= Paramutil.get(request.getParameter("name"));
        final String surname=Paramutil.get(request.getParameter("surname"));
        final String email=Paramutil.get(request.getParameter("email"));
        final Integer age=Paramutil.Parseint(request.getParameter("age"));
        final String university=Paramutil.get(request.getParameter("university"));
        final List<Student> list=repo.getlist(name,surname,email,age,university,null);
        request.getSession().setAttribute("savedlist",list);
        request.setAttribute("list",list);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String command=Paramutil.get(request.getParameter("command"));
        final Integer id= Paramutil.Parseint(request.getParameter("id"));
        Student student=fillstudent(request);
         if(command.equalsIgnoreCase("insert")){
            repo.insert(student);
            response.sendRedirect("index");
        }
        else if(command.equalsIgnoreCase("update")){
            repo.update(student);
            response.sendRedirect("index");
        }
        else if(command.equalsIgnoreCase("delete")){
                 repo.delete(id);
                 response.sendRedirect("index");
         }
    }
    private static Student fillstudent(HttpServletRequest request){
        final Integer id= Paramutil.Parseint(request.getParameter("id"));
        final String name= Paramutil.get(request.getParameter("name"));
        final String surname=Paramutil.get(request.getParameter("surname"));
        final String email=Paramutil.get(request.getParameter("email"));
        final Integer age=Paramutil.Parseint(request.getParameter("age"));
        final String university=Paramutil.get(request.getParameter("university"));
            Student s=new Student();
            s.setId(id);
            s.setName(name);
            s.setSurname(surname);
            s.setEmail(email);
            s.setAge(age);
            s.setUniversity(university);
        return s;}

}
