package org.example;

public class Subscription {
    String userName;
    double monthlyPrice;
    Subscription(String userName,double monthlyPrice){
        this.userName=userName;
        this.monthlyPrice=monthlyPrice;
    }
    double finalPrice(){
        return monthlyPrice;
    }
}
