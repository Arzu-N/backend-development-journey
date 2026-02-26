package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate publicationYear;
    private String author;
    @OneToMany(mappedBy="book")
    List<Review> review;
    private boolean deleted=false;
    public Book(Long id,String title,LocalDate publicationYear,String author,List<Review> review){
        this.id=id;
        this.title=title;
        this.publicationYear=publicationYear;
        this.author=author;
        this.review=review;

    }
    public Book(Long id,String title,LocalDate publicationYear,String author){
        this.id=id;
        this.title=title;
        this.publicationYear=publicationYear;
        this.author=author;
    }
}
