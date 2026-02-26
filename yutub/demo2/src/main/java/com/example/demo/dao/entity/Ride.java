package com.example.demo.dao.entity;

import com.example.demo.util.enums.Condition;
import com.example.demo.util.enums.Location;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Location pickupLocation ;
    @Enumerated(EnumType.STRING)
    private Location dropofLocation;
    private Double distanceKm;
    private Double price;
    @Enumerated(EnumType.STRING)
    private Condition cityCondition;
    public Ride(Location pickupLocation,Location dropofLocation,Double distanceKm,Condition cityCondition){
        this.pickupLocation=pickupLocation;
        this.dropofLocation=dropofLocation;
        this.distanceKm=distanceKm;
        this.cityCondition=cityCondition;
    }
}
