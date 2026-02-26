package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook,Long> {
}
