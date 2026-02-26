package com.example.educationnwebapp.teacher.repo;

import com.example.educationnwebapp.common.Commonrepo;
import com.example.educationnwebapp.teacher.entity.Teacher;

import java.util.List;

public class Teacherrepo implements Commonrepo<Teacher> {
    @Override
    public List <Teacher>getlist() {
        return null;
    }

    @Override
    public void insert(Teacher obj) {

    }

    @Override
    public void update(Teacher obj) {

    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public Teacher findbiyid(int id) {
        return null;
    }

    @Override
    public List<Teacher> getlist(String name, String surname,String email,Integer age,String university,String password) {
        return null;
    }
}
