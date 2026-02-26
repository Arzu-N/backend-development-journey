package org.example;

public class Mage extends Character{
    int mana;
    public Mage(String name,int baseDamage,int mana){
        super(name,baseDamage);
        this.mana=mana;
    }
    @Override
    double totalDamage() {
        return baseDamage+mana*1.5;
    }
}
