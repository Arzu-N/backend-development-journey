package com.example.demo.mapper;

import com.example.demo.dao.entity.Notebook;
import com.example.demo.dao.repository.NotebookRepository;
import com.example.demo.dto.record.NotebookRequestDto;
import com.example.demo.dto.record.NotebookResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotebookMapper {
    Notebook dtoToEntity(NotebookRequestDto dto);

    NotebookResponseDto entityToDto(Notebook notebook);



}
