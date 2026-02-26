package org.example;

public class Character{
    String name;
int baseDamage;
Character(String name,int baseDamage){
    this.name=name;
    this.baseDamage=baseDamage;
}
double totalDamage(){
    return baseDamage;
}
}
