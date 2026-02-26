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
public class Departament {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String departamentName;
    @OneToMany(mappedBy = "departament")
    private List<EmployeeDepartament> employees;
    public Departament(Long id,String departamentName){
        this.id=id;
        this.departamentName=departamentName;
    }

    public Long getId() {
        return id;
    }
}
