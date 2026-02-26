package com.example.demo.dto;

import com.example.demo.dao.entity.Room;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BinaDto {
    private String binaAdi;
    private Integer mertebe;
    private Boolean hasLift;
    private Boolean deleted;
    private Integer masaSayi;
    private Integer stulSayi;

    public BinaDto(String binaAdi,Integer mertebe,Boolean hasLift,Integer masaSayi,Integer stulSayi){
        this.binaAdi=binaAdi;
        this.mertebe=mertebe;
        this.hasLift=hasLift;
        this.masaSayi=masaSayi;
        this.stulSayi=stulSayi;
    }
    private List<RoomDto> rooms;
}
