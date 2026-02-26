package com.example.demo.controller;

import com.example.demo.dao.repository.DepartamentRepository;
import com.example.demo.dto.DepartamentRequestDto;
import com.example.demo.dto.DepartamentResponseDto;
import com.example.demo.service.DepartamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class DepartamentController {
    private final DepartamentService departamentService;
    private final DepartamentRepository repo;
    @PostMapping("/add-departament")
    public void addDepartament(@RequestBody DepartamentRequestDto dto){
        departamentService.addDepartament(dto);
    }
    @GetMapping("get-departaments/{id}")
    public DepartamentResponseDto getDepartaments(@PathVariable Long id){
        return departamentService.getDepartaments(id);
    }
    @GetMapping("get-departamentsByName/{name}")
    public List<DepartamentResponseDto> getDepartamentsByName(@PathVariable String name){
        return repo.findName(name);
    }

    @PostMapping("add-departamentt")
    public void addDepartaments(@RequestBody DepartamentRequestDto dto){
        repo.saveDepartament(dto.getDepartamentName());
    }
}
