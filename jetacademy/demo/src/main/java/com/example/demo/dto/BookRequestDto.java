package com.example.demo.dto;

import com.example.demo.dao.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookRequestDto {
    private Long id;
    private String title;
    private LocalDate publicationYear;
    private String author;

public BookRequestDto(String title,LocalDate publicationYear,String author){
    this.title=title;
    this.publicationYear=publicationYear;
    this.author=author;
}
}
