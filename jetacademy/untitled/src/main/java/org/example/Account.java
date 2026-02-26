package org.example;

public abstract class Account {
    double balance;
    public abstract void monthlyUpdate();
    void printBalance(){
        System.out.println(balance);
    }

}
