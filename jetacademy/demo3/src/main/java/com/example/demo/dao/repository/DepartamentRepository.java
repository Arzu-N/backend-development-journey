package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament,Long> {
}
