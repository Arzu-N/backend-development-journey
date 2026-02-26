package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //binary search
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int find=sc.nextInt();
        int size = sc.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        sortarray(arr);
        for (int i = 0; i <arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if(find(arr,find)==-1){
            System.out.println("not found "+find);}
        else{
            System.out.println(find+" were found at "+find(arr,find));

        }


    }
    public static void  sortarray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static int find(int[]arr,int find){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==find){

                return mid;

            }
            else  if(arr[mid]<find){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return -1;
    }
}