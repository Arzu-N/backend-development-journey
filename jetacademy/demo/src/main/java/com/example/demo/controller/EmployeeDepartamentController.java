package com.example.demo.controller;

import com.example.demo.service.EmployeeDepartamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeDepartamentController {
   private final EmployeeDepartamentService service;
    @PostMapping("/{emp_id}/{dep_id}")
    public void addEmployeeDepartament(@PathVariable Long emp_id,@PathVariable Long dep_id){
        service.addEmployeeDepartament(emp_id,dep_id);
    }
}
