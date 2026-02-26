package org.example;

import java.util.Scanner;

public class Faktorial {
    public static int factorial(int a){
    int i=1;
    int f=1;
    while(i<=a){
       f*=i;
       i++;
    }
    return f;
    }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(factorial(a));

    }
}
