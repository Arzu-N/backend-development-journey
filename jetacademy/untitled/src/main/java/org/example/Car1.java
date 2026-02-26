package org.example;

public class Car1 extends Vehicle1{

    Car1(String name){
        super(name);
    }
    @Override
    public void start(){
        System.out.println(this.name+" start");
    }
}
