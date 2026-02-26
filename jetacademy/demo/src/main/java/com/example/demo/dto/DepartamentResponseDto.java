package com.example.demo.dto;

import com.example.demo.dao.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
public class DepartamentResponseDto {
    private Long id;
    private String departamentName;
    private List<EmployeeResponseDto> employees;
    public DepartamentResponseDto(String departamentName){
        this.departamentName=departamentName;
    }
    public DepartamentResponseDto(Long id,String departamentName){
        this.id=id;
        this.departamentName=departamentName;
    }
}
