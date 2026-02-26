package com.example.demo.controller;

import com.example.demo.dto.HumanRequestDto;
import com.example.demo.dto.HumanRequestDto1;
import com.example.demo.dto.HumanResponseDto;
import com.example.demo.dto.HumanResponseDto1;
import com.example.demo.service.HumanServiice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class Human1Controller {
    private final HumanServiice service;

    @PostMapping("/add-human1")
    public void addHuman(@RequestBody HumanRequestDto1 dto){
        service.addHuman1(dto);
    }

    @GetMapping("/get-humans1")
    public List<HumanResponseDto1>getHumans(){
        return service.getHumans1();
    }
}
