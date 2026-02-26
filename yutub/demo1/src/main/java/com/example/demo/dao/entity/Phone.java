package com.example.demo.dao.entity;

import com.example.demo.util.enums.Marka;
import com.example.demo.util.enums.Model;
import com.example.demo.util.enums.OS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

         @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
     @Enumerated(EnumType.STRING)
    private Model model;
    @Enumerated(EnumType.STRING)
    private OS os;
    @Enumerated(EnumType.STRING)
    private Marka marka;
    private Double price;
    private Boolean deleted=false;
public Phone(OS os,Model model,Marka marka,Double price){
    this.os=os;
    this.marka=marka;
    this.model=model;
    this.price=price;
}

}
