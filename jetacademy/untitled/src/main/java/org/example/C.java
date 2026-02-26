package org.example;

public class C {
    public static int[] min(int[]arr,int a){
        int say=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                say++;
            }
        }
        int []b=new int[say];
        say=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                b[say]=arr[i];
                say++;
            }
        }
       return b;
    }
}
