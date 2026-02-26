package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    void deleteBookByDeleted(boolean deleted);
}
