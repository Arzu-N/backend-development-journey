package org.example;

public class Product {
    String name;
    double price;
    static int count1=0;
    static int count2=0;
    Product(String name,double price){
        this.name=name;
        this.price=price;

        if(name.equals("Iphone"))
            count1++;
        else if(name.equals("MacBook"))
            count2++;
    }
}
