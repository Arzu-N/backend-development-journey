package org.example;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    void area() {
        double a=width*height;
        String s = String.format("%.2f",a);
        System.out.println(s);
    }
}
