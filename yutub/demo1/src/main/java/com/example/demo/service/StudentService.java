package com.example.demo.service;

import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.repository.StudentRepo;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;

    public ResponseEntity<StudentEntity> saveUser(StudentDto dto){
        StudentEntity user = Mapper.dtoToEntity(dto);
        return ResponseEntity.ok(repo.save(user));

    }
    public ResponseEntity<List<StudentEntity>>getUsers(){
        return ResponseEntity.ok(repo.findAll());
    }
}
