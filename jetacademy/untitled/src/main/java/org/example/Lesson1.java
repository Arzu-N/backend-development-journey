package org.example;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int eo=(a+b)/2;
        if(eo>0){
            System.out.println("musbet");}
            else if(eo<0){
                System.out.println("menfi");

            }
            else{
            System.out.println("beraberdir");
        }
        }
    }
