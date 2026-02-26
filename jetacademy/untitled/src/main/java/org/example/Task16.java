package org.example;

public class Task16 {
   public static int sum(int a){
       int sum=0;
       while(a>0){
          sum+=a%10;
          a/=10;
       }
       return sum;
   }

    public static void sum1(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
