package org.example;

public class Checking extends Account {
    int monthlyFree;

    @Override
    public void monthlyUpdate() {
        balance-=monthlyFree;
        System.out.println("SavingAccount balance is "+balance);
    }
    public Checking(int balance){
        this.balance=balance;
    }
}
