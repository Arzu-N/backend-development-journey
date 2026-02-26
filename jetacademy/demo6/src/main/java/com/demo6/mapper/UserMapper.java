package com.demo6.mapper;

import com.demo6.dao.entity.User;
import com.demo6.dto.ExceptionDto;
import com.demo6.dto.UserRequestDto;
import com.demo6.dto.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
UserResponse toDto(User user);
User toEntity(UserRequestDto dto);
List<UserResponse> toDtoList(List<User>list);

}
