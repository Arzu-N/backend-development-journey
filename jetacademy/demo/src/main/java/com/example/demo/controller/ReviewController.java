package com.example.demo.controller;

import com.example.demo.dto.ReviewRequestDto;
import com.example.demo.dto.ReviewResponseDto;
import com.example.demo.service.ReviewService;
import jakarta.persistence.PostRemove;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ReviewController {
    private final ReviewService service;

    @GetMapping("/get-reviews")
    public List<ReviewResponseDto>getReviews(){
        return service.getReviews();
    }
    @GetMapping("/get-review/{id}")
    public ReviewResponseDto getReview(@PathVariable Long id){
        return service.getReview(id);
    }
    @PostMapping("/add-review")
    public void addReview(@RequestBody ReviewRequestDto dto){
        service.addReview(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id){
        service.deleteReview(id);
    }

    @PatchMapping("/update-review/{id}")
    public void updateReview(@PathVariable Long id,@RequestBody ReviewRequestDto dto){
        service.updateReview(id,dto);
    }
}
