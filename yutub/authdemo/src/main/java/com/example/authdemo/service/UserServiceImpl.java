package com.example.authdemo.service;

import com.example.authdemo.dto.UserLoginDTO;
import com.example.authdemo.dto.UserRegisterDTO;
import com.example.authdemo.model.User;
import com.example.authdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private  UserRepository repo;
    private final BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

    @Override
    public String userRegister(UserRegisterDTO dto){
        if(repo.findByEmail(dto.getEmail()).isPresent())
            return "Siz evvel qeydiyyat olmusunuz";
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(encoder.encode(dto.getPassword()));
        repo.save(user);
        return "ugurla qeydiyyat oldunuz!";
    }
    @Override
    public String userLogin(UserLoginDTO dto){
        Optional<User> user = repo.findByEmail(dto.getEmail());
        if(user.isEmpty()){
            return "istifadeci tapilmaddi";
        }
        User user1=user.get();
        if(encoder.matches(dto.getPassword(),user1.getPassword()))
            return "ugurlu login";
        return "yalnis parol";
    }
}
