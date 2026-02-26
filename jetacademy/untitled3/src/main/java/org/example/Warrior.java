package org.example;

public class Warrior extends Character{
    int strength;
    Warrior(String name,int baseDamage,int strength){
        super(name,baseDamage);
        this.strength=strength;
    }
    @Override
    double totalDamage() {
        return baseDamage+strength*2;
    }
}
