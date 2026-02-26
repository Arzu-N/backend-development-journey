package com.example.education.repo;
import com.example.education.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
   private final Customstudentrepo repo;
    @Autowired
    public StudentService(Customstudentrepo repo){
        this.repo=repo;
    }

    public void sendEmailAllStudent(){
        List<Student> list = repo.getlist();
        for(Student s:list){
            sendEmailStudent(s);
        }
    }
    public static void sendEmailStudent(Student s){}
}
