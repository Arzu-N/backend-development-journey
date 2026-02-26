package com.example.demo.service;

import com.example.demo.dao.entity.Book;
import com.example.demo.dao.entity.Review;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.dao.repository.ReviewRepository;
import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import com.example.demo.dto.ReviewRequestDto;
import com.example.demo.mapper.MapperBookReview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repo;
    private final MapperBookReview mapper;
private final ReviewRepository reviewRepo;
    public void addBook(BookRequestDto dto){

                repo.save(mapper.bookDtoToEntity(dto));
    }

    public List<BookResponseDto> getBooks(){
        return repo.findAll().stream().filter(l->!(l.isDeleted())).map(mapper::bookEntityToResponseDto).toList();
    }

    public BookResponseDto getBook(Long id){
       return repo.findById(id).map(mapper::bookEntityToResponseDto).orElseThrow();

    }

    public void deleteBook(Long id){
        Book book = repo.findById(id).orElseThrow();
        book.setDeleted(true);
       repo.save(book);
    }

    public void updateBook(Long id,BookRequestDto dto){
        Book book = repo.findById(id).orElseThrow();
       if(dto.getTitle()!=null)
        book.setTitle(dto.getTitle());
        if(dto.getAuthor()!=null)
        book.setAuthor(dto.getAuthor());
        if(dto.getPublicationYear()!=null)
        book.setPublicationYear(dto.getPublicationYear());
        repo.save(book);
    }

}
