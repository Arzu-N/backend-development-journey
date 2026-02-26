package org.example;

public class Dog extends Pet{
    String breed;
    Dog(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
    }
    @Override
    double adaptionFee(){
        if(breed.equals("purepred"))
        return super.adaptionFee()+20;
        return super.adaptionFee();
    }

}
