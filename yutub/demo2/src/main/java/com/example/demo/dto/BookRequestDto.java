package com.example.demo.dto;

import lombok.Data;

@Data
public class BookRequestDto {
    private String title;
    private Long authorId;
}
