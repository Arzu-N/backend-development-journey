package org.example;

public class Pet {
    String name;
    int age;
    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    double adaptionFee(){
        return 50;
    }
}
