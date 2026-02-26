package com.example.demo.service;

import com.example.demo.dao.entity.Person;
import com.example.demo.dao.repository.PersonRepository;
import com.example.demo.dao.repository.specification.PersonSpecification;
import com.example.demo.dto.PagePersonResponseDto;
import com.example.demo.dto.PersonRequestDto;
import com.example.demo.mapper.PersonMapper;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class PersonService {
    private final PersonRepository repo;
    private final PersonMapper mapper;
    public PagePersonResponseDto getPersons(String firstName, String surName, Integer age, Double salary, int pageN, int pageS){
        Specification<Person> personSpecification = Specification.allOf(PersonSpecification.hasFirstName(firstName),
                PersonSpecification.hasSurName(surName),
                PersonSpecification.hasAge(age),
                PersonSpecification.hasSalary(salary),
                PersonSpecification.hasNotDeleted());

        Pageable pageable = PageRequest.of(pageN, pageS);

        Page<Person> page = repo.findAll(personSpecification, pageable);

return new PagePersonResponseDto(page.getContent().stream().map(mapper::entityToDto).toList(),page.getNumber(),page.getSize(),page.getTotalPages(),page.getTotalElements());

    }

    public void addPerson(PersonRequestDto dto){
        repo.save(mapper.dtoToEntity(dto));
    }
}
