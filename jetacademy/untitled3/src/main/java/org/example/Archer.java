package org.example;

public class Archer extends Character{
    int accurancy;
    Archer(String name,int baseDamage,int accurancy){
        super(name,baseDamage);
        this.accurancy = accurancy;
    }
    @Override
    double totalDamage() {
        return baseDamage+accurancy*1.2;
    }
}
