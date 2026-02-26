package com.example.demo.dto;

import com.example.demo.dao.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class DepartamentResponseDto {
    private final String departmentName;
    private final List<EmployeeResponseDto> employees;

    private LocalDateTime createAt;


    private LocalDateTime updateAt;
}
