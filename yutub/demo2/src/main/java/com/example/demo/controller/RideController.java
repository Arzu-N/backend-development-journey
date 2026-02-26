package com.example.demo.controller;

import com.example.demo.dao.entity.Ride;
import com.example.demo.dto.RequestDto;
import com.example.demo.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ride")
@RequiredArgsConstructor
public class RideController {
    private final RideService service;

    @PostMapping("/add-ride")
    public Ride addRide(@RequestBody RequestDto dto){
        return service.setPrice(dto);
    }
}
