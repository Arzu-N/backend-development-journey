package com.example.authdemo.service;

import com.example.authdemo.dto.UserLoginDTO;
import com.example.authdemo.dto.UserRegisterDTO;
import com.example.authdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {
   String userRegister(UserRegisterDTO dto);
    String userLogin(UserLoginDTO dto);
}
