package com.fruit;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@RestController
public class FruitController{
    @Getter
    @Setter
    String fruit;
    List<String>list=new ArrayList<>();
   Set<String>set= new HashSet<>();
    @GetMapping("/get-fruit")
    public List<String>getFruits(){
        return list;
    }

    @PostMapping("/add-fruit")
    public void addFruit(String fruit){
        if(fruit.trim().isEmpty()){
            throw new RuntimeException("meyve yoxdur");
        }
        list.add(fruit);
    }
    @PostMapping("/add-set-fruit")
    public void addSetFruit(String fruit){
        if(fruit.trim().isEmpty()){
            throw new RuntimeException("meyve yoxdur");
        }
        set.add(fruit);
    }
    @GetMapping("/get-fruit-by-id")
    public List<String>getFruitById(String fruit){
        return list.stream().filter(l->l.equals(fruit)).toList();
    }
@DeleteMapping("/delete")
public void deleteFruit(String fruit){

    set.remove(fruit);
}
    @PostMapping("/fruit-exist")
    public String checkAndAdd(String fruit){
        if(list.contains(fruit)){
            return "meyve listde var";
        }
        else{
        list.add(fruit);
        return "meyve elave olundu";
    }
}}
