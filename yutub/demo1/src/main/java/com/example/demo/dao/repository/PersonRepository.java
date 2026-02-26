package com.example.demo.dao.repository;

import com.example.demo.dao.entity.PersonEntiity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntiity,Long> {

}
