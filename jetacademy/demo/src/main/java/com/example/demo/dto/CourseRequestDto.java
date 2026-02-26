package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data

public class CourseRequestDto {
    private final Long id;
    private final String course_name;
    private final List<StudentResponseDto>students;
}
