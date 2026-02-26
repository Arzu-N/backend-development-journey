package com.example.demo.dto;

import com.example.demo.util.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneRequestDto {
    private String brand;
    private String model;
    private Color color;
    private Double price;
}
