package org.example;

public class DiscountedProduct extends Product{
    double discountPercent;
    public double finalPrice(){
        price-=(price*discountPercent/100);
        return price;
    }
}
