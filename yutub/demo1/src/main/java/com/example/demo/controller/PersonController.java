package com.example.demo.controller;

import com.example.demo.dao.entity.PersonEntiity;
import com.example.demo.dao.entity.PersonEntiity1;
import com.example.demo.dao.repository.PersonRepository;
import com.example.demo.dao.repository.PersonRepository1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repo;

   private final  PersonRepository1 repo1;

    @GetMapping("/get")
    public List<PersonEntiity> getPersons(){
        return repo.findAll();
    }
    @GetMapping("/get1")
    public List<PersonEntiity1> getPersons1(){
        return repo1.findAll();
    }
    @GetMapping("/get11")
    public long getPersonscount(){
        return repo.findAll().size()+repo1.findAll().size();
    }
    @GetMapping("/18>sumAge")
    public Integer getPersonsSumAge(){
        return repo.findAll().stream().mapToInt(PersonEntiity::getAge).sum();
    }
    @GetMapping("/18<sumAge")
    public Integer getPersonsSumAge1(){
        return repo1.findAll().stream().mapToInt(PersonEntiity1::getAge).sum();
    }

    @GetMapping("/sumAge")
    public Integer getPersonsSumAge2(){
        return repo.findAll().stream().mapToInt(PersonEntiity::getAge).sum()+repo1.findAll().stream().mapToInt(PersonEntiity1::getAge).sum();
    }
    @GetMapping("/sumAge1")
    public Integer getPersonsSumAge12(){

        return Math.max(repo.findAll().stream().mapToInt(PersonEntiity::getAge).sum(), repo1.findAll().stream().mapToInt(PersonEntiity1::getAge).sum());
    }
    @PostMapping("/post")
    public void addPerson(@RequestBody PersonEntiity person){
        if(person.getAge()>=18){
           repo.save(person);
        }
        repo1.save(new PersonEntiity1( person.getFirstname(), person.getSurname(),person.getAge()));
    }

    @PatchMapping("/patch")
    public void updatePerson(@RequestBody PersonEntiity person,@RequestParam Long id){
        Optional<PersonEntiity> user = repo.findById(id);
        user.ifPresent(u->{u.setFirstname(person.getFirstname());
        u.setSurname(person.getSurname());
        u.setAge(person.getAge());
    });
        }

        @DeleteMapping("/delete")
    public void deletePerson(@RequestParam Long id){
            Optional<PersonEntiity> user = repo.findById(id);
            user.ifPresent(repo::delete);
        }

        @GetMapping("/maxAge")
    public PersonEntiity maxAge(){
            List<PersonEntiity> all = repo.findAll();
            OptionalInt max = all.stream().mapToInt(PersonEntiity::getAge).max();
            for(PersonEntiity e:all){
                if(e.getAge().equals(max.getAsInt())){
                    return e;
                }
            }
            return null;
            //post ,metodunda parametr olaraq list otururuk
        }
}
