package com.example.demo.controller;

import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BookController {
    private final BookService service;

    @PostMapping("/add-book")
    public void addBook(@RequestBody BookRequestDto dto){
        service.addBook(dto);
    }

    @GetMapping("/get-books")
    public List<BookResponseDto> getBooks(){
        return service.getBooks();
    }

    @GetMapping("/get-book/{id}")
    public BookResponseDto getBook(@PathVariable Long id){
        return service.getBook(id);
    }


    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }

    @PatchMapping("/update-book/{id}")
    public void updateBook(@PathVariable Long id,@RequestBody BookRequestDto dto){
        service.updateBook(id,dto);
    }
}
