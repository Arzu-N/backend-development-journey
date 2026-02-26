package com.example.demo.mapper;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.dto.PageEmployeeResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

     EmployeeResponseDto entityToDto(Employee employee);

    PageEmployeeResponseDto entityToPageDto(Employee employee);

     Employee dtoToEmployee(EmployeeRequestDto dto);
}
