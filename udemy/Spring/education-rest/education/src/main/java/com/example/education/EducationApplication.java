package com.example.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.education")
public class EducationApplication {
	public static void main(String[] args) {
		SpringApplication.run(EducationApplication.class, args);
	}

}
