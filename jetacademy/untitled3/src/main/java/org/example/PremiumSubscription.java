package org.example;

public class PremiumSubscription extends Subscription{
    int extraDevices;
    PremiumSubscription(String username,double monthlyPrice,int extraDevices){
        super(username,monthlyPrice);
        this.extraDevices = extraDevices;
    }
    @Override
    double finalPrice(){
        return monthlyPrice+(extraDevices*3);
    }
}
