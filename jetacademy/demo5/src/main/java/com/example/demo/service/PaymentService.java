/*
package com.example.demo.service;

import com.example.demo.dto.PaymentDto;
import com.example.demo.dto.SenderDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
// gondermek istediyin istifadecinin yasi 18den azdirsa rollback et
@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PersonRepository personRepository;

    @Transactional
    public void payment(SenderDto dto){
        Person sender = personRepository.findByCardNumber(dto.getSenderCardNumber());
        Double balance = sender.getBalance();
        if(balance>0){
           for(PaymentDto d : dto.getList()){
               if(sender.getBalance() > d.getAmount()){
                   sender.setBalance(sender.getBalance() - d.getAmount());
                   Person receiver = personRepository.findByCardNumber(d.getReceiverCardNumber());
                   receiver.setBalance(receiver.getBalance() +d.getAmount());
                   personRepository.save(receiver);
               }else throw new RuntimeException("balance kifayet etmir");
           }
        }
    }
}
*/
