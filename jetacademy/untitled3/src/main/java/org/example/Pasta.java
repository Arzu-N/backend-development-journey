package org.example;

public class Pasta extends Meal{
    String sauceType;
    public Pasta(String name,double basePrice,String sauceType){
        super(name,basePrice);
        this.sauceType=sauceType;
    }
    @Override
    double finalPrice()
    {
       if(sauceType.equals("white"))
           return basePrice+2;
       else if(sauceType.equals("red"))
           return basePrice+1;
       return basePrice;
    }
}
