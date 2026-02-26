package com.example.demo.dao.repository.specification;

import com.example.demo.dao.entity.Employee;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

public class EmployeeSpecification {

    public static Specification<Employee> hasFirstName(String firstName){
        return (root,query,cb)-> firstName == null ? cb.conjunction() : cb.like(cb.lower(root.get("firstName")),"%"+firstName.toLowerCase()+"%");


    }

    public static Specification<Employee> hasSurname(String surname){
        return (root,query,cb)-> surname == null ? cb.conjunction() :
            cb.like(cb.lower(root.get("surname")), "%"+surname.toLowerCase()+"%");
    }

    public static Specification<Employee> hasAge(Integer age){
        return (root,query,cb)-> age == null ?cb.conjunction():
             cb.equal(root.get("age"), age);

    }

    public static Specification<Employee> hasDepartament(String departament){
        return (root,query,cb)-> departament == null ? cb.conjunction():
            cb.like(cb.lower(root.get("departament")), "%"+departament.toLowerCase()+"%");

    }

    public static Specification<Employee> hasSalary(Double salary){
        return (root,query,cb)->
            salary == null ?  cb.conjunction():
             cb.equal(root.get("salary"),salary);
    }

    public static Specification<Employee> hasBonus(Double bonus){
        return (root,query,cb)->
            bonus == null ?  cb.conjunction() :
            cb.equal(root.get("bonus"),bonus);
    }

    public static Specification<Employee> hasDeleted(){
        return (root,query,cb)-> cb.isFalse(root.get("deleted"));
    }

}
