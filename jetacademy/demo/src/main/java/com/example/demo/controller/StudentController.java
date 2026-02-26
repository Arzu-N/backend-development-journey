package com.example.demo.controller;

import com.example.demo.dto.StudentResponseDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {
    private final StudentService service;
    @GetMapping("/get-students/{id}")
    public StudentResponseDto getStudents(@PathVariable Long id){
       return service.getStudent(id);
    }
}
