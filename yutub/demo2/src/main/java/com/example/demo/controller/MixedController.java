/*
package com.example.demo.controller;

import com.example.demo.dao.entity.Author;
import com.example.demo.dao.entity.Book;
import com.example.demo.dao.repository.AuthorRepository;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MixedController {
    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;

 */
/*   @GetMapping("/{id}")
    public AuthorDto getAuthor(@PathVariable Long id){
        Optional<Author> author = authorRepo.findById(id);
        return entityToAuthorDtoList(author.orElseThrow(()->new RuntimeException("Author not found")));
    }*//*

 @GetMapping("/{id}")
 public AuthorDto getAuthor(@PathVariable Long id){
     Optional<Author> author = authorRepo.findById(id);
     return entityToAuthorDtoList(author.orElseThrow(()->new RuntimeException("Author not found")));
 }
 @GetMapping("/boo/{id}")
    public BookDto getBook(@PathVariable Long id){
     Optional<Book> book = bookRepo.findById(id);
     return
        Optional<BookDto> book =  book.orElseThrow(()->new RuntimeException("Author not found"));
    }
    @PostMapping("/add-author")
    public void addAuthor(@RequestBody Author author){
        authorRepo.save(author);
    }
    @PostMapping("/add-book")
    public void addAuthor(@RequestBody Book book){
        bookRepo.save(book);
    }

    @GetMapping("/get")
    public List<AuthorDto> getAuthorAndBooks(){
//        return entityToAuthorDtoList(authorRepo.findAll())
    return null;
    }


    private BookDto entityToBookDto(Book e){
        return new BookDto(e.getTitle());
    }

    private List<BookDto> entityToBookDtoList(List<Book> e){
        return e.stream().map(this::entityToBookDto).toList();
    }

    private AuthorDto entityToAuthorDtoList(Author e ){
        return new AuthorDto(e.getName(),entityToBookDtoList(e.getBook()));
    }


}
*/
