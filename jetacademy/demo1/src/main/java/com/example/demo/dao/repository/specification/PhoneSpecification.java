package com.example.demo.dao.repository.specification;

import com.example.demo.dao.entity.Phone;
import com.example.demo.util.Color;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class PhoneSpecification {

    public static Specification<Phone> filterPhone(String brand, String model, Color color, Double price){
        return(root,query,cb)->{
            List<Predicate> predicates = new ArrayList<>();
            if(brand!=null&&!brand.isEmpty())
                predicates.add(cb.like(
                        cb.lower(root.get("brand")),"%"+brand.toLowerCase()+"%"));
            if(model!=null&&!model.isEmpty())
                predicates.add(cb.like(
                        cb.lower(root.get("model")),"%"+model.toLowerCase()+"%"));
            if(price!=null)
                predicates.add(cb.greaterThan(root.get("price"),price));

            predicates.add(cb.isFalse(root.get("deleted")));
            return cb.and(predicates.toArray(new Predicate[0]));
        };
        //conjunction(
    }
}
