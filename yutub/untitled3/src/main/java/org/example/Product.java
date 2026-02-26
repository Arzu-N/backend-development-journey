package org.example;

public class Product {
    String name;
    double price;
    static int c1=0;
    static int c2=0;
    Product(String name,double price){
        this.name=name;
        this.price=price;
        if(name.equals("Iphone"))
            c1++;
        else if(name.equalsIgnoreCase("MacBook"))
            c2++;
    }
}
