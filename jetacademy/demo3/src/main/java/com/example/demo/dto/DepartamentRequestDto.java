package com.example.demo.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
public class DepartamentRequestDto {
    private final String departmentName;
}
