package com.demo3.service;

import com.demo3.dao.repository.BookRepository;
import com.demo3.dto.BookRequestDto;
import com.demo3.exception.CustomValidationException;
import com.demo3.exception.NotValidAuthor;
import com.demo3.exception.NotValidCount;
import com.demo3.exception.NotValidTitle;
import com.demo3.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repo;
private final BookMapper mapper;

    public void addBook(BookRequestDto dto){
        CustomValidationException map= new CustomValidationException();
        if(dto.getTitle().trim().isBlank())
         //   throw new NotValidTitle("ad bos ola bilmez");
map.addError("title","title bos ola bilmez");
         if(dto.getAuthor().trim().isBlank())
          //  throw new NotValidAuthor("author bos ola bilmez");
            map.addError("author","author bos ola bilmez");
         if(dto.getCount()<=0)
         //   throw new NotValidCount("mehsul sayi 0-dan boyuk olmalidir");
            map.addError("count","count bos ola bilmez");
         if(dto.getPrice()<=0)
          //  throw new NotValidTitle("price 0-dan kicik ola bilmez");
            map.addError("price","price 0-dan kicik ola bilmez");
        if(!map.getErrors().isEmpty()) { // əgər hər hansı error varsa, exception at
            throw map;
        }
        repo.save(mapper.dtoToEntity(dto));
    }
}
