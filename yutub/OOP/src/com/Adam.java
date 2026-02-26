package com;



public class Adam {
    String name;
    String surname;
    int age;
    public Adam(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
    }
    public void info(){
        System.out.println(this.name+" "+this.surname+" "+this.age);
        System.out.println();
    }

}
