package org.example;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      int sum=0;
      int max=0;
         Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
           if(arr[i]>max){
               max=arr[i];
           }
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
      //5  System.out.println(sum);
        System.out.println(max);
    }
}
