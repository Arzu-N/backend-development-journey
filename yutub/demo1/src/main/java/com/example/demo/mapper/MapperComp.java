package com.example.demo.mapper;

import com.example.demo.dao.entity.CompTable;
import com.example.demo.dto.CompRequestDto;
import com.example.demo.dto.CompResponseDto;
import org.springframework.stereotype.Component;

@Component
public class MapperComp {

    public CompResponseDto entityToDto(CompTable e){
        return new CompResponseDto(e.getBrand(), e.getModel(), e.getRam(), e.getCpu(), e.getGpu(), e.getPrice());
    }

    public CompTable dtoToEntity(CompRequestDto e){

            return new CompTable(e.getBrand(), e.getModel(), e.getRam(), e.getCpu(), e.getGpu(), e.getPrice());
        }
    }
