package com.example.demo.rest;

import com.example.demo.dto.BinaDto;
import com.example.demo.service.BinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BinaController {
    private final BinaService service;

    @GetMapping("/binas")
    public List<BinaDto>findBina(){
        return service.getBina();
    }
}
