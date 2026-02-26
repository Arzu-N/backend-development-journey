package com.example.demo.dto;

import com.example.demo.util.enums.Condition;
import com.example.demo.util.enums.Location;
import lombok.Data;

@Data
public class RequestDto {
    private Location pickupLocation;
    private Location dropofLocation;
    private Double distanceKm;
    private Condition cityCondition;
}
