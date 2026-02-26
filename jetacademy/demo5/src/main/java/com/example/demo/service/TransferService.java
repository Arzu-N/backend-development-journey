package com.example.demo.service;

import com.example.demo.dto.ReceiverDto;
import com.example.demo.dto.SenderDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransferService {

    private final PersonRepository personRepository;

    @Transactional
    public void transfer(SenderDto dto) {
        Person sender = personRepository.findByCardNumber(dto.getSenderCardNumber()).orElseThrow(() -> new RuntimeException("Sender not found"));
        double totalAmount = 0;
        for (ReceiverDto r : dto.getReceivers()) {
            totalAmount += Math.round(r.getAmount() * 100.0) / 100.0;
        }
        if (totalAmount > sender.getBalance()) throw new RuntimeException("Balance not enought");
        sender.setBalance((Math.round((sender.getBalance() - totalAmount) * 100.0)) / 100.0);
        for (ReceiverDto r : dto.getReceivers()) {
            Person receiver = personRepository.findByCardNumber(r.getReceiverCardNumber()).orElseThrow(() -> new RuntimeException("Receiver not found"));
            receiver.setBalance(receiver.getBalance() + r.getAmount());

        }

    }

    @Transactional
    public void transfer1(SenderDto dto){
        Person sender = personRepository.findByCardNumber(dto.getSenderCardNumber()).orElseThrow(() -> new RuntimeException("Sender not found"));
        Double totalAmount = dto.getReceivers().stream().map(ReceiverDto::getAmount).reduce(0d, (a, b) -> a + b);
    if(sender.getBalance()<totalAmount) throw new RuntimeException("Amount not enought");
    sender.setBalance(Math.round((sender.getBalance()-totalAmount)*100.0)/100.0);
    dto.getReceivers().stream().forEach(r->{
        Person receiver = personRepository.findByCardNumber(r.getReceiverCardNumber()).orElseThrow(() -> new RuntimeException("Receiver not found"));
        if(receiver.getAge()<18&&r.getAmount()>100)throw new RuntimeException("Not valid");
        receiver.setBalance(Math.round((receiver.getBalance()+r.getAmount())*100.0)/100.0);
    });
    }
}
