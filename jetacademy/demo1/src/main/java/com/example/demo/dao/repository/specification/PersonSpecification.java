package com.example.demo.dao.repository.specification;

import com.example.demo.dao.entity.Person;
import org.springframework.data.jpa.domain.Specification;

public class PersonSpecification {

    public static Specification<Person>hasFirstName(String firstName){
        return (root,query,cb)->{
            if(firstName==null||firstName.isEmpty()) return cb.conjunction();
                return cb.like(cb.lower(root.get("firstName")),"%"+firstName.toLowerCase()+"%");};
    }

    public static Specification<Person>hasSurName(String surName){
        return (root,query,cb)->{
            if(surName==null||surName.isEmpty()) return cb.conjunction();
            return cb.like(cb.lower(root.get("surName")),"%"+surName.toLowerCase()+"%");};
    }

    public static Specification<Person>hasAge(Integer age){
        return (root,query,cb)->{
            if(age==null) return cb.conjunction();
            return cb.equal(cb.lower(root.get("age")),age);};
    }

    public static Specification<Person>hasSalary(Double salary){
        return (root,query,cb)->{
            if(salary==null) return cb.conjunction();
            return cb.equal(cb.lower(root.get("salary")),salary);};
    }

    public static Specification<Person>hasNotDeleted(){
        return ((root, query, cb) ->cb.isFalse(root.get("deleted")) );
    }
}
