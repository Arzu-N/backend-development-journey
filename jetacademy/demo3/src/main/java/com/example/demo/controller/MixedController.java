package com.example.demo.controller;

import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.service.MixedService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/api/v1")
public class MixedController {
    private final MixedService service;

    @PostMapping("/add-departament")
    public void addDepartament(@RequestBody DepartamentRequestDto dto) {
        service.addDepartament(dto);
    }

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody EmployeeRequestDto dto) {
        service.addEmployee(dto);
    }


    @GetMapping("/employees/{departamentId}")
    public ResponseEntity<DepartamentResponseDto> getEmployees(@PathVariable Long departamentId) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(service.getEmployees(departamentId));
    }

}
