package com.example.demo.mapper;

import com.example.demo.dao.entity.Person;
import com.example.demo.dto.PersonRequestDto;
import com.example.demo.dto.PersonResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonResponseDto entityToDto(Person person);

    Person dtoToEntity(PersonRequestDto dto);
}
