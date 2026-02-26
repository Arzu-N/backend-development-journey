package com.example.education.repo;

import com.example.education.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

 public interface Istudentrepo  {
     List<Student> getlist() ;
     void insert(Student obj);

     void update(Student obj);

     void deleteById(Integer id);

     Student findbiyid(int id);

     List<Student>getlist(String name,String surname,String email,Integer age,Integer universityid);
 List<Student>findentity();
 List<Student>findbyemailandpassword(String email,String password);
 }