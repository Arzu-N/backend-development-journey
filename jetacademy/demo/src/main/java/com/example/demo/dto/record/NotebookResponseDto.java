package com.example.demo.dto.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;


public record NotebookResponseDto(

 String model,


String brand,


 int ramGb,


 int cpuCores,

 double price) {

}
