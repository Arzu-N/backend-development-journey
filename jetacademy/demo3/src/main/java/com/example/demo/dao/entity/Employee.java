package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String surname;
    private Integer age;
    private Double salary;
    @JoinColumn(name="departament_id")
    @ManyToOne
    private Departament departament;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    public Employee(String firstname,String surname,Integer age,
                    Double salary,Departament department){
        this.firstname=firstname;
        this.surname=surname;
        this.age=age;
        this.salary=salary;
        this.departament=department;
    }
}
