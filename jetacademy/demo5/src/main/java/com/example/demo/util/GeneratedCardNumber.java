package com.example.demo.util;

import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
@RequiredArgsConstructor
public class GeneratedCardNumber {
   private final PersonRepository personRepository;
   private static final SecureRandom random=new SecureRandom();
    private String generatecardNumber(){
        StringBuilder cardNumber = new StringBuilder();
        for(int i=0;i<16;i++){
            cardNumber.append(random.nextInt(10));
        }
        return cardNumber.toString();
    }

    public String generateUniqueCardNumber(){
        String card;
        do{
            card = generatecardNumber();
        }
        while(personRepository.existsByCardNumber(card));
        return card;
    }
}
