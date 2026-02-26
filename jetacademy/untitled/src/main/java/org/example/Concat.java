package org.example;

public class Concat {
    public static void concat(int[]a,int[]b){
        int l=(a.length+b.length);
        int[]c=new int[l];
        int s=0;
        for(int i=0;i<a.length;i++){
            c[s++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[s++]=b[i];
        }
        int[]d=new int [s];
        int  k=0;
        for(int i=0;i<s;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(c[i]==c[j]){
                    f=true;
                    break;
                }
            }
            if(!f){
                d[k++]=c[i];
            }

        }
        for(int i=0;i<k;i++)
            System.out.println(d[i]);
    }

    public static void main(String[] args) {

        int[]a={2,7,9,7,9,8,10};
        int[]b={1,9,0,-9,1,0,-9,-7};
        concat(a,b);
    }
}
