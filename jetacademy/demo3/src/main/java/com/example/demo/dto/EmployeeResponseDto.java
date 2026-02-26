package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class EmployeeResponseDto {
    private final String firstname;
    private final String surname;
    private final Integer age;
    private final Double salary;

    private LocalDateTime createAt;


    private LocalDateTime updateAt;
}
