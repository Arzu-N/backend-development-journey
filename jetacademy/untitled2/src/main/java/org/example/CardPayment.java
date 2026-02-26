package org.example;

public class CardPayment extends Payment{
    CardPayment(double amount){
        super(amount);
    }
    @Override
    double finalAmount(){
        return amount+amount*0.015;
    }
}
