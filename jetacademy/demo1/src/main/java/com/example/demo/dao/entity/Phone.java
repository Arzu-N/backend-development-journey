package com.example.demo.dao.entity;

import com.example.demo.util.Color;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.awt.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  brand;
    private String model;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Double price;
    @Builder.Default
    private Boolean deleted=false;
}
