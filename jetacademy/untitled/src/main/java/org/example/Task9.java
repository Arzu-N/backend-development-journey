package org.example;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
      int [] a=new int[5];
    int say1=0;
    int say2=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                say1++;
            }
            else{
                say2++;

            }
        }

        int[] b=new int[say1];
        int[] c=new int[say2];
        say1=0;
        say2=0;
        for(int i=0;i<a.length;i++){

            if(a[i]%2==0){
               b[say1]=a[i];
                say1++;
            }
            else{
                c[say2]=a[i];
                say2++;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
