package com.example.demo.service;

import com.example.demo.dao.entity.Course;
import com.example.demo.dao.entity.Student;
import com.example.demo.dao.entity.StudentCourse;
import com.example.demo.dao.repository.CourseRepository;
import com.example.demo.dao.repository.StudentCourseRepository;
import com.example.demo.dao.repository.StudentRepository;
import com.example.demo.dto.CourseRequestDto;
import com.example.demo.dto.CourseResponseDto;
import com.example.demo.dto.StudentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;
    private final StudentCourseRepository studentCourseRepo;

    public CourseResponseDto getCourses(Long id){
        Course course = courseRepo.findById(id).orElseThrow();
        CourseResponseDto courseResponseDto = new CourseResponseDto();
        courseResponseDto.setId(course.getId());
        courseResponseDto.setCourseName(course.getCourseName());
        List<StudentResponseDto> list=new ArrayList<>();
        for(StudentCourse s: course.getStudents()){
            list.add(studentEntityToDto(s.getStudent()));
        }
        courseResponseDto.setStudents(list);
        return  courseResponseDto;
    }
    private StudentResponseDto studentEntityToDto(Student s ){
        return new StudentResponseDto(s.getId(),s.getFirstname());
    }
}
