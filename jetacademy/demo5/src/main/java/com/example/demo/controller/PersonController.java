package com.example.demo.controller;

import com.example.demo.dto.PersonRequest;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public ResponseEntity<PersonResponseDto>addPerson(@RequestBody PersonRequest dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.addPerson(dto));
    }
}
