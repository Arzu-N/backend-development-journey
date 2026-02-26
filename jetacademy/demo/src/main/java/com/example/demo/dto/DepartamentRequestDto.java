package com.example.demo.dto;

import com.example.demo.dao.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepartamentRequestDto {
    private Long id;
    private String departamentName;
    private List<EmployeeRequestDto> employees;
    public DepartamentRequestDto(Long id,String departamentName){
        this.id=id;
        this.departamentName=departamentName;
    }
}
