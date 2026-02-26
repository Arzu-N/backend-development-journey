package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    @OneToMany(mappedBy="employee")
    private List<EmployeeDepartament>departaments;
    public Employee(Long id,String firstname){
        this.id=id;
        this.firstname=firstname;
    }
}
