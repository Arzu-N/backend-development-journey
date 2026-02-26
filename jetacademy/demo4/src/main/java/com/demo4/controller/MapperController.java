package com.demo4.controller;

import com.demo4.dto.HumanRequestDto;
import com.demo4.dto.HumanRequestDto1;
import com.demo4.dto.HumanResponseDto;
import com.demo4.dto.HumanResponseDto1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.demo4.service.HumanService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MapperController {
    private final HumanService service;

    @PostMapping("/add-human")
    public void addHuman(@RequestBody HumanRequestDto dto){
        service.addHuman(dto);
    }

    @GetMapping("/get-humans")
    public List<HumanResponseDto>getHumans(){
        return service.getHumans();
    }

    @PostMapping("/add-human1")
    public void addHuman1(@RequestBody HumanRequestDto1 dto){
        service.addHuman1(dto);
    }

    @GetMapping("/get-humans1")
    public List<HumanResponseDto1>getHumans1(){
        return service.getHumans1();
    }

    @GetMapping("/get-humans2")
    public List<HumanResponseDto>findAlll(){
        return service.getHumans2();
    }

    @DeleteMapping("/delete/{id}")
public void deleteHuman(@PathVariable Long id){
        service.deleteHuman(id);
    }

    @GetMapping("/get-by-id/{id}")
    public HumanResponseDto findHuman(@PathVariable Long id){
        return service.getHuman(id);
    }

    @GetMapping("/get-human-by-age/{age}")
    public List<HumanResponseDto> findHumanByAge(@PathVariable Integer age){
        return service.getHumanByAge(age);
    }

    @GetMapping("/get-human-by-name/{h}")
    public List<HumanResponseDto> findHumanByAge(@PathVariable String h){
        return service.getHumanByName(h);
    }
}
