package com.example.demo.controller;

import com.example.demo.dto.SenderDto;
import com.example.demo.service.TransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/transfer")
public class TransferController {

    private final TransferService transferService;

    @PostMapping
    public ResponseEntity<Void>transfer(@RequestBody SenderDto dto){
        transferService.transfer(dto);
        return  ResponseEntity.ok().build();
    }

    @PostMapping("/1")
    public ResponseEntity<Void>transfer1(@RequestBody SenderDto dto){
        transferService.transfer1(dto);
        return ResponseEntity.ok().build();
    }
}
