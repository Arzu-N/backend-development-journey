package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.EmployeeDepartament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDepartamentRepository extends JpaRepository<EmployeeDepartament,Long> {
}
