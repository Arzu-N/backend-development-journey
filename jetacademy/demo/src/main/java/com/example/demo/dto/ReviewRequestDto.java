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
public class ReviewRequestDto {
    private Long id;
    private Integer rating;
    private String comment;
    private Long bookId;
}
