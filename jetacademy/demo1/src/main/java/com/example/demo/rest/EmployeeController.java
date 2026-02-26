package com.example.demo.rest;

import com.example.demo.dao.entity.Employee;
import com.example.demo.dto.PageEmployeeResponseDto;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public PageEmployeeResponseDto getEmployees(@RequestParam(required = false)String firstName,
                                                @RequestParam(required = false)String surname,
                                                @RequestParam(required = false)Integer age,
                                                @RequestParam(required = false)String departament,
                                                @RequestParam(required = false)Double salary,
                                                @RequestParam(required = false)Double bonus,
                                                @RequestParam(required = false,defaultValue = "0")int pageN,
                                                @RequestParam(required = false,defaultValue = "2")int pageS){
        return employeeService.getEmployee(firstName,surname,age,departament,salary,bonus,pageN,pageS  );

    }
}
