package com.demo4.dao.repository;

import com.demo4.dao.entity.Human;
import com.demo4.dto.HumanResponseDto;
import com.demo4.dto.HumanResponseDto1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HumanRepository extends JpaRepository<Human,Long> {

    @Query(value="select full_name,age from human where deleted=false",nativeQuery = true)
    List<HumanResponseDto> findAlll();

    @Query(value="select full_name,age from human where id=:id and deleted=false",nativeQuery = true)

    HumanResponseDto findHuman(Long id);

    @Query(value="select full_name,age from human where age=:age and deleted=false",nativeQuery = true)
    List<HumanResponseDto> findHumanByAge(Integer age);


    @Query(value="select full_name,age from human where full_name ilike :h%  and deleted=false",nativeQuery = true)
    List<HumanResponseDto> findHumanByName(String h);
}
