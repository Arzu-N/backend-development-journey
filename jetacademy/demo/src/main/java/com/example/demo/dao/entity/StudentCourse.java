package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.action.internal.OrphanRemovalAction;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="student_id")
    Student student;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="course_id")
    Course course;
}
