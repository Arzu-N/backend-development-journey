package org.example;

public class FamilySubscription extends Subscription{
    int member;
    FamilySubscription(String userName,double monthlyPrice,int member){
        super(userName,monthlyPrice);
        this.member=member;
    }
    @Override
    double finalPrice(){
        return monthlyPrice+member*2;
    }
}
