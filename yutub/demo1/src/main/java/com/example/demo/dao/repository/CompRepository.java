package com.example.demo.dao.repository;

import com.example.demo.dao.entity.CompTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompRepository extends JpaRepository<CompTable,Long> {
    List<CompTable>findCompTablesByDeleted(Boolean deleted);
}
