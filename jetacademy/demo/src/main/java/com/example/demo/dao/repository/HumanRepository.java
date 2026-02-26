package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human,Long> {
}
