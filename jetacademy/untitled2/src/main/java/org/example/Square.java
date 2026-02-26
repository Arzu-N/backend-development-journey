package org.example;

public class Square extends Shape{
    double side;
    public Square(double side,String name){
        super(name);
    this.side=side;}
    double area(){
        return side*side;
    }

}
