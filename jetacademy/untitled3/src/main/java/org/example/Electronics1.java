package org.example;

public class Electronics1 extends Productt{
    Electronics1(String name,double price){
        super(name,price);
    }
    @Override
    void getFinalPrice() {
        System.out.println(price +price*0.1);
    }
}
