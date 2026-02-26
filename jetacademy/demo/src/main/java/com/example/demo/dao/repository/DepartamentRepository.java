package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dto.DepartamentResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DepartamentRepository extends JpaRepository<Departament,Long> {
   @Transactional
   @Modifying
    @Query(value ="select id,departament_name from departament where departament_name=:name",nativeQuery = true)
   List<DepartamentResponseDto>findName(@Param("name")String namw);
    @Transactional
    @Modifying
    @Query(value = "insert into departament (departament_name) values(:name)",nativeQuery = true)
    void saveDepartament(@Param("name")String name);
}
