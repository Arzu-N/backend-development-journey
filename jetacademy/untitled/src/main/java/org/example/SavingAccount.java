package org.example;

public class SavingAccount extends Account{
    @Override
    public void monthlyUpdate() {
        balance-=balance*interestRate/100;
        System.out.println("SavingAccount balance is "+balance);
    }
    int interestRate;
    public SavingAccount(int balance){
        this.balance=balance;
    }
}
