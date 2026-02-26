package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Course;
import com.example.demo.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
