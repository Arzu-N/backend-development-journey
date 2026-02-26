package org.example;

public class Phone1 extends Device{
    String model;
    Phone1(String brand,String Model){
        super(brand);
        this.brand=brand;
    }
    @Override
    public void info(){
        System.out.println("Phone brand "+brand+" phone model "+model);
    }
}
