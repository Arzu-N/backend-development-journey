package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer masaSayi;
    private Integer stulSayi;
    @Builder.Default
    private Boolean deleted=false;
    @ManyToOne()
    @JoinColumn(name="bina_id")
    private Bina bina;
}
