package org.example;

public class FoodProduct extends Product2{
    String expirationDate;
    public FoodProduct(String productName,String expirationDate) {
        super(productName);
        this.expirationDate = expirationDate;
    }


}
