package org.example;

public class Train extends Transport{
    Train(String name){
        super(name);
    }
double consumeEnergy(double km){
        return km*3;
}
}
