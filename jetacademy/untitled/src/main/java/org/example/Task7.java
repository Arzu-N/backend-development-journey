package org.example;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0&&a%5==0){
            System.out.println("eded hem 3e hem 5e bolunur");
        }
        else if(a%3==0&&a%5!=0){
            System.out.println("eded yalniz 3e bolunur");
        }
        else if(a%3!=0&&a%5==0){
            System.out.println("eded yalniz 5e bolunur");
        }
        else if(a%3!=0&&a%5!=0){
            System.out.println("eded hec birine bolunmur");
        }
    }
}
