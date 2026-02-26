package com.example.demo.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record NotebookRequestDto(
@NotBlank(message = "Model boş ola bilməz")
 String mode,

@NotBlank(message = "Brand boş ola bilməz")
String brand,

@Positive(message = "RAM müsbət olmalıdır")
 int ramGb,

@Positive(message = "CPU nüvələrinin sayı müsbət olmalıdır")
 int cpuCores,
@Positive(message = "Qiymət müsbət olmalıdır")
 double price) {

}
