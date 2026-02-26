package com.example.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
//    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="author_id")
    private Author author;
public Book(String title){
    this.title=title;
}

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
}
