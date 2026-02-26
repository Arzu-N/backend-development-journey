/*
package com.example.education.repo;

import com.example.education.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class Studentrepo2 implements Istudentrepo {
    private final EntityManager em;
    public Studentrepo2(EntityManager em){
        this.em=em;
    }
    @Override
    public List<Student> getlist() {
        TypedQuery<Student> findbyname = em.createNamedQuery("" +
                "findbyname", Student.class);
        return findbyname.getResultList();
    }

    @Override
    public void insert(Student obj) {

    }

    @Override
    public void update(Student obj) {
    }
    @Override
    public void deleteById(Integer id) {
    }
    @Override
    public Student findbiyid(int id) {
        return null;
    }
    @Override
    public List<Student> getlist(String name, String surname, String email, Integer age, Integer universityid) {
        return null;
    }
    @Override
    public List<Student> findentity() {
        return null;
    }
}
*/
