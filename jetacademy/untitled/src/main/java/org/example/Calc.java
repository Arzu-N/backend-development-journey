package org.example;

public class Calc {
    public void add(int a,int b,String e){
        if(e.equals("add"))
        System.out.println(a+b);
    }
    public void subtract(int a,int b,String e){
        if(e.equals("subtract"))
        System.out.println(a-b);
    }
}
