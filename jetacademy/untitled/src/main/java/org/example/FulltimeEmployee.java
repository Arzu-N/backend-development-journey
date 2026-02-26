package org.example;

public class FulltimeEmployee extends Employee1 {
    double salary;
    FulltimeEmployee(String name,double salary){
        super(name);
        this.salary = salary;
    }
}
