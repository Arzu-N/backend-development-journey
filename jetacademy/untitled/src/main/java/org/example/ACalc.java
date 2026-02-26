package org.example;

public class ACalc extends Calc{
    public void multiply(int a,int b,String e){
        if(e.equals("multiply"))
        System.out.println(a*b);
    }
    public void divide(int a,int b,String e){
        if(e.equals("divide")&&b!=0)
        System.out.println(a/b);
        else if(b==0)
            System.out.println("sifira bolme mumkun deyil");
    }
}
