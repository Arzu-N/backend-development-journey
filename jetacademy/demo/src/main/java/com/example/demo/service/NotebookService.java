package com.example.demo.service;

import com.example.demo.dao.repository.NotebookRepository;
import com.example.demo.dto.record.NotebookRequestDto;
import com.example.demo.exception.CapasityNotEnough;
import com.example.demo.exception.NotFountNotebook;
import com.example.demo.mapper.NotebookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotebookService {
    private final NotebookRepository repo;
    private final NotebookMapper mapper;

    public ResponseEntity<?>getNotebooks(){
        return ResponseEntity.ok().body(repo.findAll().stream().map(mapper::entityToDto));
    }

    public void addNotebook(NotebookRequestDto dto){
        if(dto.ramGb()<=0)
            throw new CapasityNotEnough("capasity not enough");
        repo.save(mapper.dtoToEntity(dto));
         }

    public ResponseEntity<?>getNotebookById(Long id){
        return ResponseEntity.ok().body(mapper.entityToDto(repo.findById(id).orElseThrow(()->new NotFountNotebook("noutbook tapilmadi"))));
    }
}
