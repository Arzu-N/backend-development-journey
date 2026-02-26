package org.example;

public class Catt extends Animall{
    Catt(){
        super.info();
    }
    @Override
    void sound() {
        System.out.println("Cat");
    }
}
