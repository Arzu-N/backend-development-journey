package org.example;

public class AudioBook extends Book{
    double length;
    AudioBook(double length,String title,String Author){
        super(title,Author);
        this.length = length;
    }
    @Override
    void info(){
        System.out.println(title+" Audio "+length);
    }
}
