package com.example.educationnwebapp.Student.repo;

import com.example.educationnwebapp.Student.entity.Student;
import com.example.educationnwebapp.common.Commonrepo;
import com.example.educationnwebapp.common.Database;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Studentrepo implements Commonrepo<Student> {
    @Override
    public  List<Student> getlist() {
        List<Student>result=new ArrayList<>();
        try(Connection con= Database.connect()){
            PreparedStatement pstmt= con.prepareStatement("Select * from student");
            ResultSet resultSet = pstmt.executeQuery();
            while(resultSet.next()){
                // System.out.println("id:"+id+" name:"+name+" email:"+email+" age:"+age+" university:"+university);
                result.add(fillstudent(resultSet));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return result;}
    @Override
    public void insert(Student obj) {
        try(Connection con=Database.connect()){
            PreparedStatement pstmt = con.prepareStatement("insert into student (name,surname,email,age,university)"+"values(?,?,?,?,?)");
            pstmt.setString(1,obj.getName());
            pstmt.setString(2,obj.getSurname());
            pstmt.setString(3,obj.getEmail());
            pstmt.setInt(4,obj.getAge());
            pstmt.setString(5,obj.getUniversity());
            pstmt.execute();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Student obj) {
        try(Connection con=Database.connect()){
            PreparedStatement pstmt = con.prepareStatement("update student set name=?,surname=?,email=?,age=?,university=? where id=?");
            pstmt.setString(1,obj.getName());
            pstmt.setString(2,obj.getSurname());
            pstmt.setString(3,obj.getEmail());
            pstmt.setInt(4,obj.getAge());
            pstmt.setString(5,obj.getUniversity());
            pstmt.setInt(6,obj.getId());
            pstmt.execute();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
     try(Connection con=Database.connect()){
         PreparedStatement pstmt= con.prepareStatement("delete from student where id=?");
         pstmt.setInt(1,id);
        pstmt.execute();
     }
     catch(Exception ex){
         ex.printStackTrace();
     }
    }

    @Override
    public Student findbiyid(int id) {
        try(Connection con= Database.connect()){
            PreparedStatement pstmt = con.prepareStatement("Select * from student where id=?");
            pstmt.setInt(1,id);
            ResultSet resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                // System.out.println("id:"+id+" name:"+name+" email:"+email+" age:"+age+" university:"+university);
                return  fillstudent(resultSet);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
return null;
    }
  public List<Student>getlist(String name,String surname,String email,Integer age,String university,String password){
        List<Student>result=new ArrayList<>();
        int index=0;
        String query="Select * from student where 1=1";
        if(name!=null&&name.trim().length()>0){
            query+=" and name=?";
            index++;
        }
      if(surname!=null&&surname.trim().length()>0){
          query+=" and surname=?";
          index++;
      }
      if(email!=null&&email.trim().length()>0){
          query+=" and email=?";
          index++;
      }
      if(age!=null&&age>0){
          query+=" and age=?";
          index++;
      }
      if(university!=null&&university.trim().length()>0){
          query+=" and university=?";
index++;
      }
      if(password!=null&&password.trim().length()>0){
          query+=" and password=?";

      }
      try(Connection con=Database.connect()){
          PreparedStatement pstmt = con.prepareStatement(query);
          if (password != null && password.trim().length() > 0) {

              pstmt.setString(index--, password);
          }
          if (university != null && university.trim().length() > 0) {

              pstmt.setString(index--, university);
          }
          if (age != null && age > 0) {

              pstmt.setInt(index--, age);
          }
          if (email != null && email.trim().length() > 0) {

              pstmt.setString(index--, email);
          }
          if (surname != null && surname.trim().length() > 0) {

              pstmt.setString(index--, surname);
          }
          if (name != null && name.trim().length() > 0) {

              pstmt.setString(index, name);
          }
          ResultSet resultSet = pstmt.executeQuery();
      while(resultSet.next()){
          result.add(fillstudent(resultSet));
      }
      }
      catch(Exception ex){
          ex.printStackTrace();
          }
  return result;}
    private static Student fillstudent(ResultSet resultSet)throws Exception{
        Student student=new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setSurname(resultSet.getString("surname"));
        student.setEmail(resultSet.getString("email"));
        student.setAge(resultSet.getInt("age"));
        student.setUniversity(resultSet.getString("university"));
        student.setPassword(resultSet.getString("password"));
        return student;
    }}



