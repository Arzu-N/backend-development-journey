package com.example.demo.mapper;

import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public static UserDto entityToDto(UserEntity user){
        return new UserDto(user.getFirstname());
    }

    public static UserEntity dtoToEntity(UserDto dto){
        return new UserEntity(dto.getFirstname());
    }

    public static StudentEntity dtoToEntity(StudentDto dto){
        return new StudentEntity(dto.getFirstname());
    }

}
