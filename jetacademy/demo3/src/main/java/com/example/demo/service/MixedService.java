package com.example.demo.service;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.DepartamentRepository;
import com.example.demo.dao.repository.EmployeeRepository;
import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.mapper.MixedMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class MixedService {
    private final DepartamentRepository departamentRepo;
    private final EmployeeRepository employeeRepo;
    private final MixedMapper mapper;

    public void addDepartament(DepartamentRequestDto dto){
        String name=dto.getDepartmentName();



                boolean exists = departamentRepo.findAll().stream()
                        .anyMatch(d -> name.equals(d.getDepartmentName()));

                if (exists)
                    throw new RuntimeException("tekrar var");

                departamentRepo.save(new Departament(name));
            }

/// sql normalizatioon



    public void addEmployee(EmployeeRequestDto dto){
        Long departamentId = dto.getDepartamentId();
        Departament departament = departamentRepo.findById(departamentId).orElseThrow();
        employeeRepo.save(new Employee(dto.getFirstname(), dto.getSurname(), dto.getAge(), dto.getSalary(),departament));

    }

    public DepartamentResponseDto getEmployees(Long departamentId){

        return mapper.departamentEntityToDto(departamentRepo.findById(departamentId).orElseThrow(
                () -> new RuntimeException("Department not found")
        ));

    }}


