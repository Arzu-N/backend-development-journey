package com.example.education.repo;

import com.example.education.entity.Student;
import com.example.education.entity.Studentprojection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/*public interface Mydatastudentrepo extends JpaRepository<Student,Integer> { //queryni adla yaziriq,avtomatik sql e cevrilir
    List<Student> findbyNameandSurname(String name,String surname);
}*/
@Repository
public interface Studentrepodata extends JpaRepository<Student,Integer> { //data jpa library
    @Query(value="select *,concat(name,' ',surname) as fullname from Mystudent where name=:name and surname=:surname",nativeQuery=true)
   List<Studentprojection>getAll(@Param("name") String name, @Param("surname") String surname);
}