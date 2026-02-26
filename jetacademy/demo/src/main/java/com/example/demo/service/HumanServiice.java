package com.example.demo.service;

import com.example.demo.dao.entity.Human;
import com.example.demo.dao.entity.Human1;
import com.example.demo.dao.repository.Human1Repository;
import com.example.demo.dao.repository.HumanRepository;
import com.example.demo.dto.*;
import com.example.demo.mapper.HumanMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanServiice {
    private final HumanRepository repo;
    private final HumanMapper mapper;
    private final Human1Repository repo1;

    public void addHuman(HumanRequestDto dto){
       /* String[] split = dto.getFullname().trim().split(" ");
        Human human = new Human();
        human.setAge(dto.getAge());
        human.setName(split[0]);
        human.setSurname((split[1]));*/

//repo.save(mapper.dtoToEntity(dto));

    }

    public void addHuman1(HumanRequestDto1 dto){
       /* String[] split = dto.getFullname().trim().split(" ");
        Human human = new Human();
        human.setAge(dto.getAge());
        human.setName(split[0]);
        human.setSurname((split[1]));*/

        repo1.save(mapper.dtoToEntity1(dto));

    }

    public List<HumanResponseDto> getHumans(){
        List<Human> all = repo.findAll();
        return  all.stream().map(mapper::entityToDto).toList();
    }

    public List<HumanResponseDto1> getHumans1(){
        List<Human1> all = repo1.findAll();
        return  all.stream().map(mapper::entityToDto1).toList();
    }

    public void addHuman2(Human2RequestDto dto){
     repo.save(mapper.dtoToEntity(dto));
    }
}
