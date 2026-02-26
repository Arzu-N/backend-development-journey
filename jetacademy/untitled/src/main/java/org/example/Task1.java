package org.example;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("1-ci ededi daxil edin");
            int a = sc.nextInt();
            System.out.println("2-ci ededi daxil edin");
            int b = sc.nextInt();
            int sum=a+b;
            int subtraction=a-b;
            int multiply=a*b;
            int divide=a/b;
            int mod= a%b;
            System.out.println("sum: "+sum);
            System.out.println("subtraction: "+subtraction);
            System.out.println("multiply: "+multiply);
            System.out.println("divide: "+divide);
            System.out.println("mod: "+mod);
        }
    }


