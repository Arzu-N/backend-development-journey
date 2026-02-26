package org.example;

public abstract class Productt {

    String name;
    double price;
    Productt(String name,double price){
        this.name=name;
        this.price=price;
    }
    abstract void getFinalPrice();
}
