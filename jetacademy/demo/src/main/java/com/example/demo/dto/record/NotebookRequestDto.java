package com.example.demo.dto.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record NotebookRequestDto(
@NotBlank(message = "Model boş ola bilməz")
 String model,

@NotBlank(message = "Brand boş ola bilməz")
String brand,


 int ramGb,

@Positive(message = "CPU nüvələrinin sayı müsbət olmalıdır")
 int cpuCores,
@Positive(message = "Qiymət müsbət olmalıdır")
 double price) {

}
