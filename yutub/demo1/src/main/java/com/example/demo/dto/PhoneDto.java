package com.example.demo.dto;

import com.example.demo.util.enums.Marka;
import com.example.demo.util.enums.Model;
import com.example.demo.util.enums.OS;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PhoneDto {
    private Model model;
    private OS os;
    private Marka marka;
    private Double price;

}
