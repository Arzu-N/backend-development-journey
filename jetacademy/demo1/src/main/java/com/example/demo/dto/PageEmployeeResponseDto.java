package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageEmployeeResponseDto {
    long totalPages;
    long totalElements;
    int pageNumber;
    int pageSize;
    List<EmployeeResponseDto> content;
}
