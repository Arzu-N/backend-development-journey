package com.example.authdemo.controller;

import com.example.authdemo.dto.UserLoginDTO;
import com.example.authdemo.dto.UserRegisterDTO;
import com.example.authdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService service;
    @PostMapping("/register")
    public String register(@RequestBody UserRegisterDTO dto){
        return service.userRegister(dto);
    }
    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO dto){
        return service.userLogin(dto);
    }
}
