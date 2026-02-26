package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal=sc.nextInt();
        if(bal>0&&bal<=50){
            System.out.println("F");
        }
        else if(bal>50&&bal<=60){
            System.out.println("D");
        }

        else if(bal>60&&bal<=70){
            System.out.println("C");
        }
        else if(bal>70&&bal<=80){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
    }
}
