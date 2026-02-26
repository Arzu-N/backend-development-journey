package org.example;

public class Plane extends Transport{
    Plane(String name){
        super(name);
    }
    @Override
    double consumeEnergy(double km){
        return km*20;
    }
}
