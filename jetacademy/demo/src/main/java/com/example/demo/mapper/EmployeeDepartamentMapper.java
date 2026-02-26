package com.example.demo.mapper;

import com.example.demo.dao.entity.Course;
import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dto.CourseRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDepartamentMapper {
    public Employee employeeDtoToEntity(EmployeeRequestDto dto) {
        return new Employee(dto.getId(), dto.getFirstname());
    }

    public EmployeeResponseDto employeeEntityToDto(Employee e) {
        return new EmployeeResponseDto(e.getId(), e.getFirstname());
    }

    public DepartamentResponseDto departamentEntityToDto(Departament d) {
        DepartamentResponseDto departamentResponseDto = new DepartamentResponseDto();
        departamentResponseDto.setId(d.getId());
        departamentResponseDto.setDepartamentName(d.getDepartamentName());
        return departamentResponseDto;
    }

    public Departament departamentDtoToEntity(DepartamentResponseDto dto) {
        Departament departament = new Departament();
        departament.setDepartamentName(dto.getDepartamentName());
        return departament;


    }
}
