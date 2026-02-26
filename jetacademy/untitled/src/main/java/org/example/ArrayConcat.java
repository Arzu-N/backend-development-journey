package org.example;

public class ArrayConcat {
    public  static void concat(int[]a,int[]b){
        int count=0;
        for(int i=0;i<a.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(a[j]==a[i]){
                    f=true;
                    break;
                }}
                if(!f)
                    count++;
        }
        for(int i=0;i<b.length;i++){
           boolean f=false;
            for(int j=0;j<i;j++){
               if(b[j]==b[i]){
                   f=true;
                   break;
               }
            }

            if(!f){
                for(int z=0;z<a.length;z++){
                    if(a[z]==b[i]){
                        f=true;
                        break;
                    }
                }
                if(!f){
                    count++;
                }}
        }
        int[]c=new int[count];
        int size=0;
        for(int i=0;i<a.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(a[j]==a[i]){
                    f=true;
                    break;
                }
            }
            if(!f)
              c[size++]=a[i];

        }
        for(int i=0;i<b.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(b[j]==b[i]){
                    f=true;
                    break;
                }
            }
            if(!f){
                for(int z=0;z<a.length;z++){
                    if(a[z]==b[i])
                        f=true;
                }
                if(!f)
                    c[size++]=b[i];

            }}
            for (int i=0;i<count;i++)
                System.out.println(c[i]);
        }



    public static void main(String[] args) {

        int[]a={2,7,9,7,9,8,10};
        int[]b={1,9,0,-9,1,0,-9,-7};
        concat(a,b);
    }
}
