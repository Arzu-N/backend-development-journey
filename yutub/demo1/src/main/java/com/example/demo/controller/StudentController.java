package com.example.demo.controller;

import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.dao.repository.StudentRepo;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepo repo;
    private final StudentService service;

    @GetMapping("/get-students")
    public List<StudentEntity> getStudents(){
        return repo.findAll();
    }

    @PostMapping("/add-student")
    public void addStudent(@RequestBody StudentEntity student){
        repo.save(student);
    }

    @PatchMapping("/update-student")
    public void updateStudent(@RequestBody StudentEntity student,@RequestParam Long id){
        Optional<StudentEntity> user = repo.findById(id);
        user.ifPresent(u->{
            if(student.getFirstname()!=null)
                u.setFirstname(student.getFirstname());
            if(student.getSurname()!=null)
            u.setSurname(student.getSurname());
            if(student.getAge()!=null)
            u.setAge(student.getAge());
                repo.save(u);});

    }

    @DeleteMapping("/delete-student")
    public void deleteStudent(@RequestParam Long id){
        Optional<StudentEntity> user = repo.findById(id);
       user.ifPresent(repo::delete);
    }
    @PostMapping("/student-add")
    public void addStudent(@RequestBody StudentDto dto){
        service.saveUser(dto);
    }
}
