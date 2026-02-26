package org.example;

public class Clothess extends Productt{
    Clothess(String name,double price){
        super(name,price);
    }
    @Override
    void getFinalPrice() {
        System.out.println(price -price*0.05);
    }
}
