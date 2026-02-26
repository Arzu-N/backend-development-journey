package org.example;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] a=new int[5];
        int[]b=new int[5];
//    int max=-arr[0];
//    int min=arr[0];
//    int sum=0;
//    int smus=0;
//    int sm=0;
//    int s=0;
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<5;i++){
           a[i]=sc.nextInt();
            b[i]=a[i]*a[i];
          //  sum+=arr[i];
        }

//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//           else  if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>0){
//                System.out.println("musbet: "+arr[i]);
//                smus++;
//            }
//            else if(arr[i]<0){
//                System.out.println("menfi: "+arr[i]);
//                sm++;
//            }
//            else{
//                System.out.println("sifir: "+arr[i]);
//                s++;
//            }
//        }
      //  System.out.println(arr.length);
      //  System.out.println("max :"+max+" "+"min :"+min);
     //   System.out.println(sum);
//        System.out.println("musbet sayi "+smus);
//        System.out.println("menfi sayi "+sm);
//        System.out.println("sifir sayi "+s);
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
    }
}
