package org.example;

public class SmartHeater extends SmartDevice{
    double temperature;
    public SmartHeater(String name,double powerUsage,double temperature){
        super(name,powerUsage);
        this.temperature=temperature;
    }
    @Override
    public double calculateDailyCost(){
        return super.calculateDailyCost()+(temperature*0.05);
    }
}
