package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private  Long id;
    private  String firstname;
    private  List<CourseRequestDto>courses;

}
