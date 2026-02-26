package org.example;

public class Electronics extends Product{
    int warranty;
    Electronics(String name,double price,int warranty){
        super(name,price);
        this.warranty=warranty;
    }
    @Override
    double finalPrice(){
        if(warranty>1)
        return price+price*0.1;
        return price;
    }
}
