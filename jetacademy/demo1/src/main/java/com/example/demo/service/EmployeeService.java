package com.example.demo.service;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.EmployeeRepository;
import com.example.demo.dao.repository.specification.EmployeeSpecification;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.dto.PageEmployeeResponseDto;
import com.example.demo.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repo;
private final EmployeeMapper mapper;
    public PageEmployeeResponseDto getEmployee(String firstName, String surname, Integer age, String departament, Double salary, Double bonus, int pageN, int pageS){
        Specification<Employee> employeeSpecification = Specification.allOf(
                EmployeeSpecification.hasFirstName(firstName),
                EmployeeSpecification.hasSurname(surname),
                EmployeeSpecification.hasAge(age),
                EmployeeSpecification.hasDepartament(departament),
                EmployeeSpecification.hasSalary(salary),
                EmployeeSpecification.hasBonus(bonus),
                EmployeeSpecification.hasDeleted());


        Pageable pageable = PageRequest.of(pageN, pageS, Sort.by("salary").ascending());
        Page<Employee> all = repo.findAll(employeeSpecification, pageable);

        return new PageEmployeeResponseDto(all.getTotalPages(), all.getTotalElements(),all.getNumber(),all.getSize(),all.getContent().stream().map(mapper::entityToDto).toList());
//        return new PageEmployeeResponseDto(page.getTotalPages(),page.getTotalElements(),page.getContent().stream().map(mapper::entityToDto).toList());

    }
}
