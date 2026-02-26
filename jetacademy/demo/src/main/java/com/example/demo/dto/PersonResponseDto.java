package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;


@Data
public class PersonResponseDto {
    private Long id;
    @NotBlank(message="firstName must be not blank")
    private String firstname;
    @Positive(message="age must be positive")
    private Integer age;
    private Long count;
    private double balance;
    private String country;
   /*  public PersonResponseDto(Integer age,Long count){
         this.age=age;
         this.count=count;
     }*/

    public PersonResponseDto(/*Long id,*/String firstname,Integer age/*,double balance,String country*/){
   //    this.id=id;
        this.firstname=firstname;
        this.age=age;
       /* this.balance=balance;
this.country=country;*/
    }

}
