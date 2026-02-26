package com.example.demo.rest;

import com.example.demo.dto.PagePersonResponseDto;
import com.example.demo.dto.PersonRequestDto;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PersonController {
    private final PersonService service;
    @GetMapping("/persons")
    public PagePersonResponseDto getPersons(@RequestParam(required=false)String firstName,
                                            @RequestParam(required=false)String surName,
                                            @RequestParam(required=false)Integer age,
                                            @RequestParam(required=false)Double salary,
                                            @RequestParam(required=false,defaultValue = "0")int pageN,
                                            @RequestParam(required=false,defaultValue = "2")int pageS){
        return service.getPersons(firstName,surName,age,salary,pageN,pageS);
    }

    @PostMapping("person")
    public void addPerson(@RequestBody PersonRequestDto dto){
        service.addPerson(dto);
    }
}
