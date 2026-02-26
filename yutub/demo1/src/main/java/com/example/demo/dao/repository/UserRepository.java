package com.example.demo.dao.repository;

import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dto.UserDto;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    public List<UserEntity>findUserEntitiesByDeleted(Boolean deleted);
    public List<UserEntity>findUserEntitiesByFirstname(String name,Boolean deleted);

}
