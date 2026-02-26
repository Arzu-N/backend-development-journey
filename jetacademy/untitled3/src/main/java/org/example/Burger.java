package org.example;

public class Burger extends Meal{
    boolean extraCheese;
    public Burger(String name, int basePrice, boolean extraCheese){
        super(name,basePrice);
        this.extraCheese = extraCheese;
    }
    @Override
    double finalPrice(){
        return basePrice+(extraCheese?2:0);
    }
}
