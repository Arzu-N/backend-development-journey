package org.example;

public class RegularProduct extends Product1 {
    RegularProduct(double price){
        super(price);
    }
    @Override
    void getPrice(){
        System.out.println(price);
    }
}
