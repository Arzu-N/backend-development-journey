package com.example.demo.controller;

import com.example.demo.dao.repository.PersonRepository;
import com.example.demo.dto.*;
import com.example.demo.service.PersonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PersonController {

    private final PersonRepository  repo;
    private final PersonService service;
    @GetMapping("/get-persons")
    List<PersonResponseDto>getPersons(){
        return repo.getPersons();
    }

    @PostMapping("/add-person")
    public void addemployee(@RequestBody @Valid PersonRequestDto dto){
        repo.addPerson(dto.getFirstname(),dto.getAge());
    }

    @GetMapping("get-person-by-id/{id}")
    PersonResponseDto getPerson(@PathVariable Long id){
        return service.getPersonById(id);
    }


    @GetMapping("get-person-by-name-and-age/{name}/{age}")
    List<PersonResponseDto> getPerson(@PathVariable String name,@PathVariable Integer age){
        return service.getPersonNameAndAge(name,age);
    }

    @PatchMapping("/update-person/{name}/{age}")
    public void updatePerson(@PathVariable String name,@PathVariable Integer age){
        service.updatePerson(name,age);
    }

    @DeleteMapping("/delete-person/{age}")
    public void deletePerson(@PathVariable Integer age){
        service.deletePerson(age);
    }

    @GetMapping("/get-count")
    public Long countPerson(){
        return  service.countPerson();
    }


    @GetMapping("/group-person")
    public List<PersonResponseDto1> personGroupByAge(){
        return  service.persongroupByAge();
    }

    @GetMapping("/get-person-ordering")
    public List<PersonResponseDto> personBalance(){
        return service.personBalance();
    }

    @GetMapping("/get-min-balance")
    public Long personMinBalance(){
        return service.personMinBalance();
    }

    @GetMapping("/get-max-balance")
    public Long personMaxBalance(){
        return service.personMaxBalance();
    }

    @GetMapping("/get-avg-balance")
    public Double personAvgBalance(){
        return service.personAvgBalance();
    }

    @GetMapping("/get-sum-balance")
    public Long personSumBalance(){
        return service.personSumBalance();
    }


    @GetMapping("/get-group-balance")
    public List<Double> personGroupBalance(){
        return service.personGroupBalance();
    }

    @GetMapping("/get-max-sum-balance")
    public PersonDto personMaxSumBalance(){
        return service.personMaxSumBalance();
    }
}
