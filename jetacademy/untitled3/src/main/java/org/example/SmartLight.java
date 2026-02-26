package org.example;

public class SmartLight extends SmartDevice {
    int brightness;
    SmartLight(String name,double powerUsage, int brightness) {
        super(name,powerUsage);
        this.brightness = brightness;
    }
    @Override
    double calculateDailyCost() {
        return super.calculateDailyCost()+(brightness*0.01);
    }
}
