package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Phone;
import com.example.demo.dao.entity.UserEntity;
import com.example.demo.util.enums.OS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone,Long> {
    List<Phone> findPhonesByDeleted(Boolean deleted);
//    List<UserEntity>findPhoneEntitiesByModel(String name,Boolean deleted);
List<Phone>findPhonesByOs(OS os);

}
