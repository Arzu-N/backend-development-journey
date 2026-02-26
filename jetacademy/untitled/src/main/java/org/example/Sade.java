package org.example;

import java.util.Scanner;

public class Sade {
    public static void sade(int a){
        if(a<2){
            System.out.println("sade deyil");
            return;
        }
        boolean f=true;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
               f=false;
               break;
            }
        }
        if(f)
            System.out.println("sade");
        else
            System.out.println("sade deyil");
    }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        sade(a);
    }
}
