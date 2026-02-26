package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="person2")
public class PersonEntiity1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String surname;
    private Integer age;

    public PersonEntiity1( String firstname,String surname,Integer age) {
        this.age = age;
        this.firstname = firstname;
        this.surname=surname;
    }
}
