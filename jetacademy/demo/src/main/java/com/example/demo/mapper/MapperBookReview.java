package com.example.demo.mapper;

import com.example.demo.dao.entity.Book;
import com.example.demo.dao.entity.Review;
import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookResponseDto;
import com.example.demo.dto.ReviewRequestDto;
import com.example.demo.dto.ReviewResponseDto;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class MapperBookReview {


    public Book bookDtoToEntity(BookRequestDto dto){
        return  new Book(dto.getId(), dto.getTitle(),dto.getPublicationYear(), dto.getAuthor());
    }




    public Review reviewDtoToEntity(ReviewRequestDto dto){
        return new Review(dto.getId(),dto.getRating(), dto.getComment());
    }
    public BookResponseDto bookEntityToResponseDto(Book book){
        List<ReviewResponseDto> list = book.getReview().stream().map(this::reviewEntityToResponseDto).toList();

        return new BookResponseDto(book.getId(), book.getTitle(),book.getPublicationYear(), book.getAuthor(),list);
    }



    public ReviewResponseDto reviewEntityToResponseDto(Review review){
        return new ReviewResponseDto(review.getId(),review.getRating(), review.getComment());
    }



}
