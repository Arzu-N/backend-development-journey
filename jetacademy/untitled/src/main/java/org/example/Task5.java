package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("cut");
        }
        else{
            System.out.println("tek");
        }
    }
}
