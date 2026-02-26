package com.example.demo.mapper;

import com.example.demo.dao.entity.Departament;
import com.example.demo.dao.entity.Employee;
import com.example.demo.dao.repository.DepartamentRepository;
import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.dto.EmployeeRequestDto;
import com.example.demo.dto.EmployeeResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor

public class MixedMapper {
    private final DepartamentRepository departamentRepo;
    public DepartamentResponseDto departamentEntityToDto(Departament department){
        return new DepartamentResponseDto(department.getDepartmentName(),department.getEmployees().stream().
                map(this::employeeEntityToDto).toList(),department.getCreateAt(),department.getUpdateAt());
    }

    public Departament departamentDtoToEntity(DepartamentRequestDto dto){
        return new Departament(dto.getDepartmentName());
    }

    public EmployeeResponseDto employeeEntityToDto(Employee employee){
        return new EmployeeResponseDto(employee.getFirstname(),employee.getSurname(),employee.getAge(),
                employee.getSalary(),employee.getCreateAt(),employee.getUpdateAt());
    }

    public Employee employeeDtoToEntity(EmployeeRequestDto dto){
        Departament departament = departamentRepo.findById(dto.getDepartamentId()).orElseThrow();
        return new Employee(dto.getFirstname(),dto.getSurname(),dto.getAge(),dto.getSalary(),
                departament);
    }
}
