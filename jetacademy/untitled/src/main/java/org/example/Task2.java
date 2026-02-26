package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int a = sc.nextInt();
        int yuzluk=a/100;
        int onluq=a/10%10;
        int teklik=a%10;
      //  System.out.println(yuzluk+"\n"+onluq+"\n"+teklik);
      //  System.out.println(teklik+"\n"+onluq+"\n"+yuzluk);
        System.out.println(yuzluk+onluq+teklik);
    }

}
