package org.example;

public class Pizza extends Meal {
    String size;
    public Pizza(String name,double basePrice,String size){
        super(name,basePrice);
        this.size=size;
    }
    @Override
    double finalPrice(){
        if(size.equals("small"))
            return basePrice;
        else if(size.equals("medium"))
            return basePrice+3;
        else if(size.equals("large"))
            return basePrice+5;
        return basePrice;
    }
}
