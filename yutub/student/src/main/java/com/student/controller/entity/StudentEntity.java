package com.student.controller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name="studentss")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     Long id;

    @Column(name="name")
    String name;
    @Column(name="sur_name")
    String surname;
    Integer age;
    BigDecimal balance;

    public StudentEntity(String name, String surname, Integer age, BigDecimal balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.balance = balance;
    }
      public StudentEntity(String name){
        this.name=name;

      }

}
