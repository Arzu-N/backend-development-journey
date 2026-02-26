package com.example.demo.dto;

import com.example.demo.dao.entity.Departament;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeRequestDto {
    private Long id;
    private String firstname;


}
