package com.example.demo.service;

import com.example.demo.dao.entity.Course;
import com.example.demo.dao.entity.Student;
import com.example.demo.dao.entity.StudentCourse;
import com.example.demo.dao.repository.CourseRepository;
import com.example.demo.dao.repository.StudentCourseRepository;
import com.example.demo.dao.repository.StudentRepository;
import com.example.demo.dto.CourseResponseDto;
import com.example.demo.dto.StudentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepo;
  private final CourseRepository courseRepo;
  private final StudentCourseRepository studentCourseRepo;

/*  public StudentResponseDto getUser(Long id){
      Student student = studentRepo.findById(id).orElseThrow();
    StudentResponseDto studentResponseDto = new StudentResponseDto();
    studentResponseDto.setId(student.getId());
    studentResponseDto.setFirstname(student.getFirstname());
    List<StudentCourse> courses = student.getCourses();
    List<CourseResponseDto> list = courses.stream().map(m -> {
        Course course = m.getCourse();
        CourseResponseDto courseResponseDto = new CourseResponseDto();
        courseResponseDto.setId(course.getId());
        courseResponseDto.setCourse_name(course.getCourseName());
        return courseResponseDto;
    }).toList();
studentResponseDto.setCourses(list);
return  studentResponseDto;
  }*/
    public StudentResponseDto getStudent(Long id){
        Student student = studentRepo.findById(id).orElseThrow();
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setFirstname(student.getFirstname());
        List<CourseResponseDto> list = new ArrayList<>();
        for(StudentCourse s:student.getCourses()){
            Course course = s.getCourse();
            list.add(courseEntityToDto(course));
            studentResponseDto.setCourses(list);
        }
        return studentResponseDto;
    }
    private CourseResponseDto courseEntityToDto(Course c){
        return new CourseResponseDto(c.getId(),c.getCourseName());
    }

}
