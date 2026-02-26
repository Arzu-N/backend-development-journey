package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.resilience.annotation.EnableResilientMethods;
@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String surname;
    private Integer age;
    private String departament;
    private Double salary;
    private Double bonus;
    private Boolean deleted;

    @PrePersist
    public void deletedDeyer(){
        deleted = false;
    }

}
