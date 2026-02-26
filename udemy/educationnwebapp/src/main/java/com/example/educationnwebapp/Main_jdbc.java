package com.example.educationnwebapp;

import com.example.educationnwebapp.Student.entity.Student;
import com.example.educationnwebapp.Student.repo.Studentrepo;

import java.util.List;

public class Main_jdbc {
    private final static Studentrepo repo=new Studentrepo();
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(7);
        student.setName("Hasan");
        student.setSurname("Jamshidov");
        student.setEmail("hasan@gmail.com");
        student.setAge(20);
        student.setUniversity("BDU");
        repo.update(student);
        List<Student> list = repo.getlist();
        System.out.println(list);
    }
}
