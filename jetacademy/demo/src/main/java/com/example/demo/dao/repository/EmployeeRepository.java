package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.dto.StudentResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query(value="select employee.id,employee.firstname,departament.departament_name from employee left Join employee_departament on employee_departament.employee_id=employee.id left join departament on employee_departament.departament_id=departament.id where firstname=:name",nativeQuery = true)
    List<EmployeeResponseDto> findName(@Param("name")String name);

    @Transactional
    @Modifying
    @Query(value = "insert into employee (firstname) values(:name)",nativeQuery = true)
    void saveEmployee(@Param("name")String name);
}
