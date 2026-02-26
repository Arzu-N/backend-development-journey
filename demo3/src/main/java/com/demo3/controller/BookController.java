package com.demo3.controller;

import com.demo3.dto.BookRequestDto;
import com.demo3.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BookController {
    private final BookService service;

    @PostMapping("/book")
    public void addBook(@RequestBody BookRequestDto dto){
        service.addBook(dto);
    }
}
