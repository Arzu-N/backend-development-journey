package com.demo4.service;

import com.demo4.dao.entity.Human;
import com.demo4.dao.repository.HumanRepository;
import com.demo4.dto.HumanRequestDto;
import com.demo4.dto.HumanRequestDto1;
import com.demo4.dto.HumanResponseDto;
import com.demo4.dto.HumanResponseDto1;
import lombok.RequiredArgsConstructor;
import com.demo4.mapper.HumanMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HumanService {
    private final HumanRepository repo;
    private final HumanMapper mapper;
    public void addHuman(HumanRequestDto dto){
        repo.save(mapper.dtoToEntity(dto));
    }

    public List<HumanResponseDto>getHumans(){
        return repo.findAll().stream().map(mapper::entityToDto).toList();
    }

    public void addHuman1(HumanRequestDto1 dto){
        repo.save(mapper.dtoToEntity1(dto));
    }

    public List<HumanResponseDto1>getHumans1(){
        return repo.findAll().stream().map(mapper::entityToDto1).toList();
    }

    public List<HumanResponseDto>getHumans2(){
        return repo.findAlll().stream().toList();
    }
public void deleteHuman(Long id){
    Human human = repo.findById(id).orElseThrow();
    repo.delete(human);
}

public HumanResponseDto getHuman(Long id){
        return repo.findHuman(id);
}

public List<HumanResponseDto> getHumanByAge(Integer age){
        return repo.findHumanByAge(age);
}

    public List<HumanResponseDto> getHumanByName(String h){
        return repo.findHumanByName(h);
    }
}
