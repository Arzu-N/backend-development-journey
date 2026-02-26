package org.example;

public class Human {
    public String name;
    public Human(String name){
        this.name=name;
    }
    public void sayHi(){
        System.out.println("hi "+name);
    }
    public void sayBye(){
        System.out.println("bye "+name);
    }
}
