package org.example;

public class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    public void area(){
        double a=2*Math.PI*r*r;
        String s = String.format("%.2f", a);
        System.out.println(s);
    }

}
