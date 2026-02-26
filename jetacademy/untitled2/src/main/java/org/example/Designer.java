package org.example;

public class Designer extends Employee1{
    Designer(String name,double salary){
        super(name,salary);
    }
    double bonusSalary(){
        return salary+salary*0.1;
    }
}
