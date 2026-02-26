package com.example.demo.service;

import com.example.demo.dao.entity.CompTable;
import com.example.demo.dao.repository.CompRepository;
import com.example.demo.dto.CompRequestDto;
import com.example.demo.dto.CompResponseDto;
import com.example.demo.mapper.MapperComp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompService {
    private final CompRepository repo;
    private final MapperComp mapper;
    public void  addComp(CompRequestDto  dto){
        repo.save(mapper.dtoToEntity(dto));
    }
    public List<CompResponseDto> getComp(){
        List<CompTable> list = repo.findCompTablesByDeleted(false);
        return list.stream().map(mapper::entityToDto).toList();
    }
    public void updateComp(Long id,CompRequestDto dto){
        Optional<CompTable> comp = repo.findById(id);
        comp.ifPresent(c->{c.setBrand(dto.getBrand());
            c.setModel(dto.getModel());
            c.setRam(dto.getRam());
            c.setCpu(dto.getCpu());
            c.setGpu(dto.getGpu());
            c.setPrice(dto.getPrice());
repo.save(c);
    });

}

public void deleteComp(Long id){
    Optional<CompTable> comp = repo.findById(id);
    comp.map((l)->{
        l.setDeleted(true);
        repo.save(l);
        return comp;
    });
}
}
