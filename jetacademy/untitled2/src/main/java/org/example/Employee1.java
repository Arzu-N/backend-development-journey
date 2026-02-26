package org.example;

public class Employee1 {
    String name;
    double salary;
    Employee1(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    double bonusSalary(){
        return salary;
    }
}
