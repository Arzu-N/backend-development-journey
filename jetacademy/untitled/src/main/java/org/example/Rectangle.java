package org.example;
//name,populatiin,country  5 seher yarat,population 1milyon cox olan seherler
public class Rectangle {
    double width;
    double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public void area(double width,double height){
        System.out.println(width*height);
    }
}
