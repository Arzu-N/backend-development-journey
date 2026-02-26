package com.example.demo.mapper;

import com.example.demo.dao.entity.User;
import com.example.demo.dto.UserRequestDto;
import com.example.demo.dto.UserResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
     UserResponseDto entityToDto(User user);
    User dtoToEntity(UserRequestDto dto);
}
