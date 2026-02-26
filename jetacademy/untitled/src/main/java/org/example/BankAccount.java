package org.example;

public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;


    }
    void deposit(double amount){
        this.balance+=amount;
        System.out.println("new balance: "+balance);
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("balance not enough");
        }
        else{
            balance-=amount;
            System.out.println("new balance: "+balance);
        }
    }
}
