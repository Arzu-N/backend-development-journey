package com.example.demo.service;

import com.example.demo.dao.entity.Ride;
import com.example.demo.dao.repository.RideRepository;
import com.example.demo.dto.RequestDto;
import com.example.demo.util.enums.Condition;
import com.example.demo.util.enums.Price;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class RideService {
private final RideRepository repo;
    public Double calculatePrice(Double distanceKm, Condition cityCondition){
        Double price= Price.BASE_PRICE+(distanceKm * Price.PRICE_PER_KM);
        if(cityCondition.equals(Condition.RAIN)) {
            price *= Price.RAIN_MULTIPLIER;
            return price;
        }
        return price;

}

public Ride setPrice(RequestDto dto){
    Ride ride = new Ride(dto.getPickupLocation(), dto.getDropofLocation(), dto.getDistanceKm(), dto.getCityCondition());
    ride.setPrice(calculatePrice(dto.getDistanceKm(),dto.getCityCondition()));
    repo.save(ride);
    return ride;}
}
