package org.example;

public class Manager1 extends Employee1{
    Manager1(String name,double salary){
      super(name,salary);
    }
    double bonusSalary(){
        return salary+salary*0.3;
    }
}
