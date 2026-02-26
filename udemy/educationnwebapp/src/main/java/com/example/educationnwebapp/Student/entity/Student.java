package com.example.educationnwebapp.Student.entity;

import com.example.educationnwebapp.common.Person;

public class Student extends Person {
    private String university;
    private String password;

    public String getPassword() {
        return password;
    }

    public Student setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUniversity() {
        return university;
    }

    public Student setUniversity(String university) {
        this.university = university;
        return this;
    }
}
