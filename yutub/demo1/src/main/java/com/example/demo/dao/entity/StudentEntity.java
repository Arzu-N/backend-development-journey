package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student1")
@RequiredArgsConstructor
@Getter
@Setter
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String surname;
    private Integer age;
    public StudentEntity(String firstname,String surname,Integer age){
        this.firstname=firstname;
        this.surname=surname;
        this.age=age;
    }
    public StudentEntity(String firstname){
        this.firstname=firstname;

    }
}
