package com.example.demo.controller;

import com.example.demo.dto.Human2RequestDto;
import com.example.demo.dto.HumanRequestDto;
import com.example.demo.dto.HumanResponseDto;
import com.example.demo.service.HumanServiice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class HumanController {
    private final HumanServiice service;

    @PostMapping("/add-human")
    public void addHuman(@RequestBody Human2RequestDto dto){
        service.addHuman2(dto);
    }

    @GetMapping("/get-humans")
    public List<HumanResponseDto>getHumans(){
        return service.getHumans();
    }
}
