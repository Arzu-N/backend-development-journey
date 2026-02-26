package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonRepository extends JpaRepository<Person,Long> , JpaSpecificationExecutor<Person> {
}
