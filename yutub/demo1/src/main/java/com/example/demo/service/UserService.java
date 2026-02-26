package com.example.demo.service;

import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.Mapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repo;

    public ResponseEntity<?> saveUser(List<UserDto> dto){
        List<UserEntity> user = dto.stream().map(Mapper::dtoToEntity).toList();
         return ResponseEntity.ok(repo.saveAll(user));
    }

    public ResponseEntity<List<UserDto>>getUsers( String name){
             if(name==null||name.isEmpty()) return ResponseEntity.ok(repo.findUserEntitiesByDeleted(false).stream().map(Mapper::entityToDto).toList());
        else return ResponseEntity.ok(repo.findUserEntitiesByFirstname(name,false).stream().map(Mapper::entityToDto).toList());

    }

    public ResponseEntity<?>delete(Long id){
        Optional<UserEntity> user = repo.findById(id);

        user.ifPresent(u->u.setDeleted(true));
        repo.save(user.get());
        return ResponseEntity.noContent().build();
    }

    //repoda after before,soft delete
}
