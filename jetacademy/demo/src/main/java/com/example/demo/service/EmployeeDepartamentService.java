package com.example.demo.service;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.entity.EmployeeDepartament;
import com.example.demo.dao.repository.DepartamentRepository;
import com.example.demo.dao.repository.EmployeeDepartamentRepository;
import com.example.demo.dao.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeDepartamentService {
    private final EmployeeRepository empRepo;
    private final DepartamentRepository depRepo;
    private final EmployeeDepartamentRepository empDepoRepo;

    public void addEmployeeDepartament(Long emp_id,Long dep_id){
        Employee employee = empRepo.findById(emp_id).orElseThrow();
        Departament departament = depRepo.findById(dep_id).orElseThrow();
        EmployeeDepartament employeeDepartament = new EmployeeDepartament();
        employeeDepartament.setEmployee(employee);
        employeeDepartament.setDepartament(departament);
        empDepoRepo.save(employeeDepartament);
    }
}
