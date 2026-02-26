package com.example.demo.service;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.entity.EmployeeDepartament;
import com.example.demo.dao.repository.EmployeeRepository;
import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.mapper.EmployeeDepartamentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
  private final EmployeeRepository employeeRepo;
  private final EmployeeDepartamentMapper mapper;
    public void addEmployee(EmployeeRequestDto dto){
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setFirstname(dto.getFirstname());
        employeeRepo.save(employee);
    }

    public EmployeeResponseDto getEmployees(Long id){
        Employee employee = employeeRepo.findById(id).orElseThrow();
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setFirstname(employee.getFirstname());
        ArrayList<DepartamentResponseDto> list = new ArrayList<>();
        List<EmployeeDepartament> departaments = employee.getDepartaments();
        for(EmployeeDepartament e:departaments){
            Departament departament = e.getDepartament();
            list.add(mapper.departamentEntityToDto(departament));
        }

        employeeResponseDto.setDepartaments(list);
        return  employeeResponseDto;
    }

}
