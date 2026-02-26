package com.example.demo.service;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.entity.EmployeeDepartament;
import com.example.demo.dao.repository.DepartamentRepository;
import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeResponseDto;
import com.example.demo.mapper.EmployeeDepartamentMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class DepartamentService {
    private final DepartamentRepository departamentRepo;
private  final EmployeeDepartamentMapper mapper;
    public void addDepartament(DepartamentRequestDto dto){
        Departament departament = new Departament();

        departament.setDepartamentName(dto.getDepartamentName());

        departamentRepo.save(departament);
    }

    public DepartamentResponseDto getDepartaments(Long id){
        Departament departament = departamentRepo.findById(id).orElseThrow();

        DepartamentResponseDto departamentResponseDto = new DepartamentResponseDto();
        departamentResponseDto.setId(departament.getId());
        departamentResponseDto.setDepartamentName(departament.getDepartamentName());
        List<EmployeeDepartament> employees = departament.getEmployees();
        ArrayList<EmployeeResponseDto> list = new ArrayList<>();
        for(EmployeeDepartament e:employees){
            Employee employee = e.getEmployee();
            list.add(mapper.employeeEntityToDto(employee));
        }
        departamentResponseDto.setEmployees(list);
        return departamentResponseDto;
    }
}
