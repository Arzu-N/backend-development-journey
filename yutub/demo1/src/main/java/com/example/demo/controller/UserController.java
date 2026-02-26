package com.example.demo.controller;

import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.Mapper;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@NullMarked
public class UserController {

    private final UserService service;
    @GetMapping("/getUsers")
    public ResponseEntity<List<UserDto>>getUsers(@RequestParam(required = false) @Nullable String name){
        return service.getUsers(name);
    }

    @PostMapping("/addUsers")
    public ResponseEntity<?>addUsers(@RequestBody List<UserDto> dto){
        return service.saveUser(dto);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteUser(@PathVariable Long id){
       return service.delete(id);
    }
}
