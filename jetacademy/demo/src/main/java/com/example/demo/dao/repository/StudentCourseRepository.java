package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Course;
import com.example.demo.dao.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse,Long> {
}
