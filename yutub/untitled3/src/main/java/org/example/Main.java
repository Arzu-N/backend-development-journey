package org.example;
public class Main{
    public static void main(String[] args) {
        Product p = new Product("Iphone",4777);
        Product p1 = new Product("Macbook",4777);
        Product p2= new Product("Macbook",4777);
        Product p3= new Product("a",4777);
        Product p54 = new Product("Iphone",4777);
        Product p6 = new Product("Iphone",4777);
        Product p7 = new Product("Macbook",477);
        System.out.println(Product.c1);
        System.out.println(Product.c2);
    }
}