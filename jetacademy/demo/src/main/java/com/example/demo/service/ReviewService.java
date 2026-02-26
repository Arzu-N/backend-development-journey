package com.example.demo.service;

import com.example.demo.dao.entity.Review;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.dao.repository.ReviewRepository;
import com.example.demo.dto.ReviewRequestDto;
import com.example.demo.dto.ReviewResponseDto;
import com.example.demo.mapper.MapperBookReview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
  private final ReviewRepository repo;
  private final BookRepository bookRepo;
  private final MapperBookReview mapper;
    public void addReview(ReviewRequestDto dto){
        Long bookId = dto.getBookId();

        Review review = new Review();
        review.setRating(dto.getRating());
        review.setComment(dto.getComment());
        review.setBook(bookRepo.findById(bookId).orElseThrow());
             repo.save(review);
    }

    public List<ReviewResponseDto> getReviews(){
        return repo.findAll().stream().filter(l-> !l.isDeleted()).
                map(mapper::reviewEntityToResponseDto).toList();

    }

    public ReviewResponseDto getReview(Long id){
return  repo.findById(id).map(mapper::reviewEntityToResponseDto).orElseThrow();
    }

    public void deleteReview(Long id){
        Review review = repo.findById(id).orElseThrow();
        review.setDeleted(true);
        repo.save(review);
    }
    public void updateReview(Long id,ReviewRequestDto dto){
        Review review = repo.findById(id).orElseThrow();
        if(dto.getRating()!=null)
        review.setRating(dto.getRating());
        if(dto.getComment()!=null)
        review.setComment(dto.getComment());
        if(dto.getBookId()!=null)
        review.setBook(bookRepo.findById(dto.getBookId()).orElseThrow());
        repo.save(review);
    }
}
