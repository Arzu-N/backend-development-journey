package com.example.demo.dto;

import com.example.demo.util.enums.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompResponseDto {
    private Brand brand;
    private String model;
    private Integer ram;
    private String cpu;
    private String gpu;
    private Double price;
}
