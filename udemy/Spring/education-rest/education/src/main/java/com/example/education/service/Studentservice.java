package com.example.education.service;

import com.example.education.entity.Student;
import com.example.education.repo.Customstudentrepo;
import com.example.education.repo.Istudentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentservice {
    @Autowired
    Istudentrepo studentrepo;
    public List<Student> getlist(String name,String surname,String email,Integer age,Integer universityid) {
        return studentrepo.getlist(name,surname,email,age,universityid);
           }
    public List<Student> findbyemailandpassword(String email,String password) {
        return studentrepo.findbyemailandpassword(email,password);
    }
}
