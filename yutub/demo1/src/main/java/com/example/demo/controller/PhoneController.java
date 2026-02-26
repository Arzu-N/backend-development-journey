package com.example.demo.controller;

import com.example.demo.dto.PhoneDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.PhoneService;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/phone")
@NullMarked
public class PhoneController {

    private final PhoneService service;
    @GetMapping("/get-phones")
    public List<PhoneDto>getPhones(){
        return service.getPhone();
    }
    @GetMapping("/get-phones-price")
    public List<PhoneDto>getPhonesPrice(){
        return service.getPhonePrice();
    }
    @GetMapping("/get-phones-os")
    public List<PhoneDto>getOs(){
        return service.getOs();
    }

    @PostMapping("/add-phones")
    public String addPhones(@RequestBody PhoneDto dto){
         return service.addPhone1(dto);
    }

    @PostMapping("/add-phones-list")
    public void addPhones(@RequestBody List<PhoneDto> dto){
        service.addPhonel(dto);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePhone(@PathVariable Long id){
        service.deletePhone(id);
    }
@PatchMapping("/update")
public void updatePhones(){
        service.updateOs();
}

    @DeleteMapping("/deletee/{id}")
    public void deletePhone1(@PathVariable Long id){
        service.deletePhone1(id);
    }
}
