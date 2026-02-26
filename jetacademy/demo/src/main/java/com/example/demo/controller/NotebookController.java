package com.example.demo.controller;

import com.example.demo.dto.record.NotebookRequestDto;
import com.example.demo.dto.record.NotebookResponseDto;
import com.example.demo.mapper.NotebookMapper;
import com.example.demo.service.NotebookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class NotebookController {
    private final NotebookService service;
    private final NotebookMapper mapper;
    @GetMapping("/notebooks")
    public ResponseEntity<?> getNotebooks(){
        return service.getNotebooks();
    }

    @PostMapping("/notebook")
    public void addNotebook(@RequestBody @Valid NotebookRequestDto dto){
     service.addNotebook(dto);
    }

    @GetMapping("/notebook/{id}")
    public ResponseEntity<?> getNotebookById(@PathVariable Long id){
        return service.getNotebookById(id);
    }
}
