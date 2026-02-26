package com.example.demo.controller;

import com.example.demo.dto.CourseResponseDto;
import com.example.demo.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CourseController {
    private final CourseService service;
    @GetMapping("/get-courses/{id}")
    public CourseResponseDto getCourses(@PathVariable Long id){
        return service.getCourses(id);
    }
}
