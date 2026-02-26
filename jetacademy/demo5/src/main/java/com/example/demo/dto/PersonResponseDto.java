package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PersonResponseDto {
    private Long id;
    private String firstname;
    private String surname;
    private Integer age;
    private Double balance;
}
