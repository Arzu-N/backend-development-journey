package org.example;

public class CashPayment extends Payment{
    CashPayment(double amount){
        super(amount);
    }
    double finalAmount(){
        return amount;
    }
}
