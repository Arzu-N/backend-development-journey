package com.example.demo.dto;

import com.example.demo.dao.entity.Departament;
import lombok.Data;

@Data
public class EmployeeRequestDto {
    private final String firstname;
    private final String surname;
    private final Integer age;
    private final Double salary;
    private final Long departamentId;
}
