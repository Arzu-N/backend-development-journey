package org.example;

public class Bike extends Vehicle1{

    public Bike(String name){
        super(name);
    }
    @Override
    public void start(){
        System.out.println(this.name+" start");
    }
}
