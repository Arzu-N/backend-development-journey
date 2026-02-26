package com.example.demo.entity;

import com.example.demo.util.GeneratedCardNumber;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.*;

import java.security.SecureRandom;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Person {
    private static final SecureRandom random = new SecureRandom();



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String surname;
    private Integer age;

    private Double balance;
    private String cardNumber;


   /* @PrePersist
        public  void  generateCardNumber() {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 16; i++) {
                sb.append(random.nextInt(10));
            }

        String number = sb.toString();
            this.cardNumber=number;
    }*/




}
