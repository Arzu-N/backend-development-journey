package com.example.educationnwebapp.teacher.entity;

import com.example.educationnwebapp.common.Person;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {
private Double Salary;

    public Double getSalary() {
        return Salary;
    }

    public Teacher setSalary(Double salary) {
        Salary = salary;
        return this;
    }
    public Person person;
}
