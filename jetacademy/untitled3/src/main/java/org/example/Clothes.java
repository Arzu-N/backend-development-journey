package org.example;

public class Clothes extends Product{
    String season;
    Clothes(String name,double price,String season){
        super(name,price);
        this.season=season;
    }
    @Override
    double finalPrice(){
        if(season.equals("winter"))
        return price-price*0.05;
        return price;
    }
}
