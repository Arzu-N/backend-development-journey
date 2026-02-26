package com.example.demo.controller;

import com.example.demo.dto.CompRequestDto;
import com.example.demo.dto.CompResponseDto;
import com.example.demo.service.CompService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comp")
@RequiredArgsConstructor
public class CompController {
    private final CompService service;

    @GetMapping("/get-comps")
    public List<CompResponseDto> getComps(){
        return service.getComp();
    }

    @PostMapping("/add-comps")
    public void addComp(@RequestBody CompRequestDto dto){
        service.addComp(dto);
    }

    @PatchMapping("/update-comp/{id}")
    public void updateComp(@PathVariable Long id,@RequestBody CompRequestDto dto){
        service.updateComp(id,dto);
    }

    @DeleteMapping("/delete-comp/{id}")
    public void deleteComp(@PathVariable Long id){
        service.deleteComp(id);
    }
}
