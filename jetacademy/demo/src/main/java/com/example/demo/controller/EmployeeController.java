/*
package com.example.demo.controller;

import com.example.demo.dao.repository.EmployeeRepository;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService service;
    private final EmployeeRepository repo;
    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody EmployeeRequestDto dto){
        service.addEmployee(dto);
    }

    @GetMapping("/get-eemployees/{id}")
public EmployeeResponseDto getEmployees(@PathVariable Long id){
        return service.getEmployees(id);
    }


    @GetMapping("/get-employees/{name}")
    public List<EmployeeResponseDto> getEmployessByName(@PathVariable String name) {
       return  repo.findName(name);
    }

    @PostMapping("/add-employeee")
    void addEmployeee(@RequestBody EmployeeRequestDto dto){
        repo.saveEmployee(dto.getFirstname());
    }
}
*/
