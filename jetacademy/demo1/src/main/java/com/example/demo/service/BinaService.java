package com.example.demo.service;

import com.example.demo.dao.repository.BinaRepository;
import com.example.demo.dto.BinaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BinaService {
    private final BinaRepository repo;
    public List<BinaDto> getBina(){
        return repo.findBina();
    }
}
