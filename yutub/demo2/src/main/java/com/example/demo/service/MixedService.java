package com.example.demo.service;

import com.example.demo.dao.entity.Author;
import com.example.demo.dao.repository.AuthorRepository;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import com.example.demo.mapper.Mapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Data
public class MixedService {
    private final AuthorRepository repo;
    private final BookRepository repo1;
    private final Mapper mapper;

    public List<AuthorDto> getAuthors(){
        List<Author> all = repo.findAll();
       return  all.stream().map(Mapper::authorEntityToDto).toList();
    }

    public void addBook(BookRequestDto b){
        repo1.save(mapper.addBookDtoToEntity(b));
    }
    public void addAuthor(AuthorDto a){
        repo.save(Mapper.authorDtoToEntit(a));
    }
     public List<BookResponseDto> getBooks(){
        return repo1.findAll().stream().map(Mapper::bookEntityToDto).toList();
     }

}
