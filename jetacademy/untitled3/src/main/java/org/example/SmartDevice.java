package org.example;

public class SmartDevice {
    String name;
    double powerUsage;
    public SmartDevice(String name, double powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
    }
    double calculateDailyCost(){

      return powerUsage*0.2;
    }
}
