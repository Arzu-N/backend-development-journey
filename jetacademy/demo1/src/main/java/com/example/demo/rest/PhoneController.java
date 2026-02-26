package com.example.demo.rest;

import com.example.demo.dao.entity.Phone;
import com.example.demo.dto.PhoneRequestDto;
import com.example.demo.service.PhoneService;
import com.example.demo.util.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class PhoneController {
    private final PhoneService service;

    @GetMapping("/phones")
    public Map<String,Object>getPhones(@RequestParam(required = false)String brand,
                                       @RequestParam(required = false)String model,
                                       @RequestParam(required = false)Color color,
                                       @RequestParam(required = false)Double price,
                                       @RequestParam(defaultValue = "0")int pageNumber,
                                       @RequestParam(defaultValue = "2")int pageSize){
        Page<Phone> phones = service.getUsers(brand, model, color, price, pageNumber, pageSize);
        List<Map<String, Object>> content = phones.getContent().stream().map(phone -> {
            Map<String, Object> map = new HashMap<>();

            map.put("brand", phone.getBrand());
            map.put("model", phone.getModel());
            map.put("color", phone.getColor());
            map.put("price", phone.getPrice());
            return map;
        }).toList();
        Map<String, Object> map = new HashMap<>();
        map.put("content",content);
        map.put("pageNumber",phones.getPageable().getPageNumber());
        map.put("pageSize",phones.getPageable().getPageSize());
        map.put("totalPage",phones.getTotalPages());
        map.put("totalElement",phones.getTotalElements());
        return map;
    }

    @PostMapping("/phone")
    public void addPhone(@RequestBody PhoneRequestDto dto){
        service.addPhone(dto);
    }

}
