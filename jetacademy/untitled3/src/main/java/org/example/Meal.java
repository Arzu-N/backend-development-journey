package org.example;

public class Meal {
    String name;
    double basePrice;
    Meal(String name,double basePrice){
        this.name=name;
        this.basePrice=basePrice;
    }
    double finalPrice(){
        return basePrice;
    }
}
