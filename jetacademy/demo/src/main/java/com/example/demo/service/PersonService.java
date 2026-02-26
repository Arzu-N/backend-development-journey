package com.example.demo.service;

import com.example.demo.dao.repository.PersonRepository;
import com.example.demo.dto.PersonDto;
import com.example.demo.dto.PersonResponseDto;
import com.example.demo.dto.PersonResponseDto1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PersonService {
    private final PersonRepository repo;

    public PersonResponseDto getPersonById(Long id){
        return repo.getPersonById(id);
    }

    public List<PersonResponseDto> getPersonNameAndAge(String name,Integer age){
        return repo.getPersonByNameandAge(name,age);
    }

    public void updatePerson(String name,Integer age){
        repo.updatePerson(name,age);
    }

    public void deletePerson(Integer age){
        repo.deletePerson(age);
    }

    public Long countPerson(){
        return repo.countPerson();
    }


    public List<PersonResponseDto1> persongroupByAge(){
        return repo.personGroubByAge();
    }
    public List<PersonResponseDto> personBalance(){
        return repo.personBalance();
    }

    public Long personMinBalance(){
        return repo.personMinBalance();
    }

    public Long personMaxBalance(){
        return repo.personMaxBalance();
    }

    public Double personAvgBalance(){
        return repo.personAvgBalance();
    }

    public Long personSumBalance(){
        return repo.personSumBalance();
    }

    public List<Double> personGroupBalance(){
        return repo.personGroupBalance();
    }

    public PersonDto personMaxSumBalance(){
        return repo.personMaxSumBalance();
    }
}
