package org.example;

public final class DataTools {
    static void sum(int[]n){
        int s=0;
        for(int i=0;i<n.length;i++){
            s+=n[i];
        }
        System.out.println("sum "+s);
    }
    static void average(int[]n){
        int s=0;
        for(int i=0;i<n.length;i++){
            s+=n[i];
        }
        s/=n.length;
        System.out.println("average "+s);
    }
    static void max(int[]n){
        int max=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>max){
                max=n[i];
            }
        }
        System.out.println("max "+max);
    }
    static void min(int[]n){
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<min){
                min=n[i];
            }
        }
        System.out.println("min "+min);
    }
}
