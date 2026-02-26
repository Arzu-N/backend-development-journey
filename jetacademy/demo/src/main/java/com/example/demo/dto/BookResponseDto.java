package com.example.demo.dto;

import com.example.demo.dao.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@NoArgsConstructor
@Data
public class BookResponseDto {
    private Long id;
    private String title;
    private LocalDate publicationYear;
    private String author;
    List<ReviewResponseDto> reviews;
    public BookResponseDto(Long id,String title,LocalDate publicationYear,String author){
        this.id=id;
        this.title=title;
        this.publicationYear=publicationYear;
        this.author=author;
    }
    public BookResponseDto(Long id,String title,LocalDate publicationYear,String author,List<ReviewResponseDto>reviews){
        this.id=id;
        this.title=title;
        this.publicationYear=publicationYear;
        this.author=author;
        this.reviews=reviews;
    }
}
