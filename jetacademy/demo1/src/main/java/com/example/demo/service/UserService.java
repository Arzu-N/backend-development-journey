package com.example.demo.service;

import com.example.demo.dao.entity.User;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dao.repository.specification.UserSpecification;
import com.example.demo.dto.UserRequestDto;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class UserService {
private final UserRepository userRepo;
private final UserMapper mapper;
    public Page<User> getUsers(String firstName,String surname,Integer age,Double balance,int pageNumber,int pageSize){
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
      //  Specification <User> specification=Specification.allOf();
        Specification<User> specification = UserSpecification.filterUsers(firstName, surname, age, balance);
        return userRepo.findAll(specification,pageable);
    }

    public void addUser(UserRequestDto dto){
        userRepo.save( mapper.dtoToEntity(dto));
    }
}
