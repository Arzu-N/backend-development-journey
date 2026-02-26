package com.example.demo.service;

import com.example.demo.dto.PersonRequest;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.repository.PersonRepository;
import com.example.demo.util.GeneratedCardNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class PersonService {
private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    private final GeneratedCardNumber generatedCardNumber;

    public PersonResponseDto addPerson(PersonRequest dto){
        Person person = personMapper.toEntity(dto);
        person.setCardNumber(generatedCardNumber.generateUniqueCardNumber());
return personMapper.toDto(personRepository.save(person));
    }

}
