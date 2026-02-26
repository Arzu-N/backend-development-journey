package com.example.demo.dao.entity;

import com.example.demo.util.enums.Brand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private String model;
    private Integer ram;
    private String cpu;
    private String gpu;
    private Double price;
    private Boolean deleted=false;
    @CreationTimestamp
    private LocalDate create_at;
    @UpdateTimestamp
    private LocalDate update_at;

    public CompTable(Brand brand,String model,Integer ram,String cpu,String gpu,Double price){
        this.brand=brand;
        this.model=model;
        this.ram=ram;
        this.cpu=cpu;
        this.gpu=gpu;
        this.price=price;
    }
}
