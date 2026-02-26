package org.example;

public class Developer1 extends Employee1{
    Developer1(String name,double salary){
        super(name,salary);
    }
    @Override
    double bonusSalary(){
        return salary+salary*0.2;
    }

}
