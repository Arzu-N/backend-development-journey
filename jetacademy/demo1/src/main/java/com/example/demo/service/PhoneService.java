package com.example.demo.service;

import com.example.demo.dao.entity.Phone;
import com.example.demo.dao.repository.PhoneRepository;
import com.example.demo.dao.repository.specification.PhoneSpecification;
import com.example.demo.dto.PhoneRequestDto;
import com.example.demo.util.Color;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private final PhoneRepository phoneRepo;

    public Page<Phone> getUsers(String brand, String model, Color color,Double price,int pageNumber,int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Specification<Phone> phoneSpecification = PhoneSpecification.filterPhone(brand, model, color, price);
        return phoneRepo.findAll(phoneSpecification, pageable);
    }
        public void addPhone(PhoneRequestDto dto){
        phoneRepo.save(Phone.builder().brand(dto.getBrand()).model(dto.getModel()).color(dto.getColor()).price(dto.getPrice()).build());
        }

}
