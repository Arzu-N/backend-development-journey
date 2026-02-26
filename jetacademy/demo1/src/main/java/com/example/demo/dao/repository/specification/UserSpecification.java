package com.example.demo.dao.repository.specification;

import com.example.demo.dao.entity.User;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;


public class UserSpecification {
     public static Specification<User> filterUsers(String firstName,String surname,Integer age,Double balance){
         return (root,query,cb)->{
             ArrayList<Predicate> predicates = new ArrayList<>();
             if(firstName!=null&&!firstName.isEmpty())
                 predicates.add(cb.like(
                         cb.lower(root.get("firstName")),"%"+ firstName.toLowerCase()+"%"));
             if(surname!=null&&!surname.isEmpty())
                 predicates.add(cb.like(
                         cb.lower(root.get("surname")),"%"+surname.toLowerCase()+"%"));
             if(age!=null)
                 predicates.add(cb.equal(
                         root.get("age"),age));
             if(balance!=null)
                 predicates.add(cb.equal(root.get("balance"),balance));

             predicates.add(cb.isFalse(root.get("deleted")));

            return  cb.and(predicates.toArray(new Predicate[0]));

         };
     }
}
