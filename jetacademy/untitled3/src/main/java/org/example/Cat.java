package org.example;

public class Cat extends Pet{
    String color;
    Cat(String name,int age,String color){
        super(name,age);
        this.color=color;
    }
    @Override
    public double adaptionFee(){
        if(color.equals("white"))
            return super.adaptionFee()+10;

        return super.adaptionFee();
    }
}
