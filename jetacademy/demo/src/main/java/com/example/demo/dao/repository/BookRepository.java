package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Book;
import com.example.demo.dto.BookResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    void deleteBookByDeleted(boolean deleted);

}
