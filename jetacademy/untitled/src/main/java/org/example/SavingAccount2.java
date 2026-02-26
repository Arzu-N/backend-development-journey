package org.example;

public class SavingAccount2 extends BankAccount2{
    double interestRate;
SavingAccount2(String owner,double interestRate){
    super(owner);
    this.interestRate=interestRate;
}
}
