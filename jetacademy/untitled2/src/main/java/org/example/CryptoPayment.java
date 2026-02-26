package org.example;

public class CryptoPayment extends Payment{
    CryptoPayment(double amount){
        super(amount);
    }
    @Override
    double finalAmount(){
        return amount+amount*0.03;
    }
}
