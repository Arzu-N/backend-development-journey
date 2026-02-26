package com.demo3.mapper;

import com.demo3.dao.entity.Book;
import com.demo3.dto.BookRequestDto;
import com.demo3.dto.BookResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book  dtoToEntity(BookRequestDto dto);
    BookResponseDto entityToDto(Book book);
}
