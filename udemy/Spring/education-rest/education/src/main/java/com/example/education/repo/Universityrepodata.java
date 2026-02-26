package com.example.education.repo;

import com.example.education.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*public interface Mydatastudentrepo extends JpaRepository<Student,Integer> { //queryni adla yaziriq,avtomatik sql e cevrilir
    List<Student> findbyNameandSurname(String name,String surname);
}*/
@Repository
public interface Universityrepodata extends JpaRepository<University,Integer>{

}