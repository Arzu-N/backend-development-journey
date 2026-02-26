package org.example;

public class Device {
    String brand;
    Device(String brand) {
        this.brand = brand;
    }
    void info(){
        System.out.println(brand);
    }
}
