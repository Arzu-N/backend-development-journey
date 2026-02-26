package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@AllArgsConstructor

@Getter
@Setter
public class PersonRequestDto {

    @NotBlank(message="firstName must be not blank")
    private String firstname;
    @Positive(message="age must be positive")
    private Integer age;
}
