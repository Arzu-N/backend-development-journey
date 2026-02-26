/*package com.example.education.Student.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
private  Integer id;
    private String name;
    @ManyToMany
    @JoinTable(name="company_student",joinColumns=@JoinColumn(name="company_id"),inverseJoinColumns = @JoinColumn(name="student_id"))
    private List<Student>students;
    public Integer getId() {
        return id;
    }

    public Company setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Company setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}*/
