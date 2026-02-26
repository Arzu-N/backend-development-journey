package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer rating;
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;
    private boolean deleted;

    public Review(Long id,Integer rating,String comment){
        this.id=id;
        this.rating=rating;
        this.comment=comment;
    }
}
