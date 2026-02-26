package com.example.demo.mapper;

import com.example.demo.dto.PersonRequest;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.entity.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toEntity(PersonRequest dto);

    PersonResponseDto toDto(Person person);

    List<PersonResponseDto> toDtoList(List<Person>list);
}
