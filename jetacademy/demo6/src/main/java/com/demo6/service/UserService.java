package com.demo6.service;

import com.demo6.dao.entity.User;
import com.demo6.dao.repository.UserRepository;
import com.demo6.dto.UserRequestDto;
import com.demo6.dto.UserResponse;
import com.demo6.exception.NotValid;
import com.demo6.mapper.UserMapper;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;
@Transactional
    public UserResponse addUser(UserRequestDto dto){
        User save = userRepository.save(userMapper.toEntity(dto));
        if(save.getAge()<18){
            throw new NotValid("age 18-den kicik ola bilmez");
        }

return userMapper.toDto(save);
    }
}
