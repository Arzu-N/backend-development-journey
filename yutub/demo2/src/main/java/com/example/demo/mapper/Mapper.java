package com.example.demo.mapper;

import com.example.demo.dao.entity.Author;
import com.example.demo.dao.entity.Book;
import com.example.demo.dao.repository.AuthorRepository;
import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapper {
    private final AuthorRepository authorRepository;

    public static AuthorDto authorEntityToDto(Author e){
        return new AuthorDto(e.getName(),bookListEntityToDto(e.getBook()));
    }
    public static Author authorDtoToEntit(AuthorDto e){
        return new Author(e.getName());
    }

   public static Book bookDtoToEntity(BookResponseDto b){
        return new Book(b.getTitle());
   }
    public static BookResponseDto bookEntityToDto(Book b){
        return new BookResponseDto(b.getTitle());
    }
    public static List<BookResponseDto> bookListEntityToDto(List<Book> b){
        return  b.stream().map(Mapper::bookEntityToDto).toList();
    }


    public  Book addBookDtoToEntity(BookRequestDto dto){
        Author author = authorRepository.findById(dto.getAuthorId()).orElseThrow();


        return new  Book(dto.getTitle(),author);
    }
}
