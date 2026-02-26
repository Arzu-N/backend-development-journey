package org.example;

public class VipProduct extends Product1 {
    VipProduct(double price){
        super(price);
    }
    @Override
    void getPrice(){
        System.out.println(price-price*0.4);
    }
}
