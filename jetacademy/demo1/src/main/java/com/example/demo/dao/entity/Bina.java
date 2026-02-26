package com.example.demo.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String binaAdi;
    private Integer mertebe;
    private Boolean hasLift;
    @Builder.Default
    private Boolean deleted=false;
    @OneToMany(mappedBy = "bina")
    private List<Room>rooms;
}
