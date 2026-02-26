package org.example;

public class StudentProduct extends Product1{
    StudentProduct(double price){
        super(price);
    }
    @Override
    void getPrice(){
        System.out.println(price-price*0.2);
    }
}
