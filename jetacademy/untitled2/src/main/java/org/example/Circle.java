package org.example;

public class Circle extends Shape{
    double radius;
    Circle(double radius,String color){
        super(color);
        this.radius = radius;
    }
    double area(){
        return 2*Math.PI*radius;
    }
}
