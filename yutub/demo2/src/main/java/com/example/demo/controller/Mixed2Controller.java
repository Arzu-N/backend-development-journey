package com.example.demo.controller;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import com.example.demo.service.MixedService;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class Mixed2Controller {
    private final MixedService service;
    private final BookService service1;
     @GetMapping("/get-authors")
    public List<AuthorDto> getAuthors(){
         return service.getAuthors();
     }
     @PostMapping("/add-author")
     public void addAuthor(@RequestBody AuthorDto dto){
         service.addAuthor(dto);
     }

     @GetMapping("/get-books")
    public List<BookResponseDto>getBooks(){
         return service.getBooks();
     }
     @PostMapping("/add-book")
    public void addBook(@RequestBody BookRequestDto dto){
         service.addBook(dto);
     }
}
