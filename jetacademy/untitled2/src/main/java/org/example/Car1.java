package org.example;

public class Car1 extends Transport{
    Car1(String name){
        super(name);
    }
    @Override
    double consumeEnergy(double km){
        return km*0.1;}
}
