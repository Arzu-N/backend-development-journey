package org.example;

import java.util.Scanner;

public class Task11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum=0;
//        for (int i = 0; i <=n; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
//    }


//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n=sc.nextInt();
//    int i=1;
//    int sum=0;
//    while(i<=n){
//        sum+=i;
//        i++;
//    }
//    System.out.println(sum);
//}

//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int eded = sc.nextInt();
//    int cem=eded%10+ (eded/10)%10+(eded/100);
//    System.out.println(cem);
//}

//    public static void main(String[] args) {
//        int eded=457208310;
//        int sum=0;
//        while(eded>0){
//            eded/=10;
//            if((eded%10)%2==0){
//                continue;
//            }
//            else{
//               sum+=(eded%10);
//            }
//
//        }
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[]arr=new int[size];
//        int cem=0;
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i]==-1){break;}
//            else if(arr[i]==0){continue;}
//            else if(arr[i]>0){
//                cem+=arr[i];
//            }
//        }
//        System.out.println(cem);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[]arr=new int[size];
//        int temp;
//        int median=size/2;
//        double a;
//        for(int i=0;i<size;i++){
//            arr[i]=sc.nextInt();
//        }
//        for (int i = 0; i <size ; i++) {
//            for (int j = 0; j <size-1-i; j++) {
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }}
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//            if(size%2==1){
//
//                System.out.println(arr[median]);
//            }
//            else{
//                a=(arr[median-1]+arr[median])/2.0;
//                System.out.println(a);
//            }
//        } // median


//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int[]arr=new int[3];
//    for (int i = 0; i < 3; i++) {
//        arr[i] = sc.nextInt();
//    }
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            System.out.println(arr[i]+"+"+arr[j]+"="+(arr[i]+arr[j]));
//        }
//        System.out.println();
//    }
//}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//         int sum=0;
//        while(eded>0){
//            System.out.print(eded%10+" ");
//            sum+=eded%10;
//            eded/=10;
//        }
//        System.out.println("\n"+sum);
//    }
//polindrom

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]arr=new int[n];
//        if(n>0) arr[0]=1;
//        if(n>1) arr[1]=1;
//        int sum=0;
//        for (int i = 0; i <n ; i++) {
//            if(i==0||i==1){
//
//                System.out.print(arr[i]+" ");
//
//            }
//            else{
//            arr[i]=arr[i-1]+arr[i-2];
//            System.out.print(arr[i]+" ");
//
//        }
//            sum+=arr[i];
//        }
//        System.out.println("\n"+sum);
//    }//fibonacci


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 1;
//        int b = 1;
//        int c;
//        int sum = 0;
//        while (a<= n) {
//            sum+=a;
//            System.out.print(a+" ");
//
//            c = a + b;    1 1 2 3 5
//            a = b;
//            b = c;
//        }
//        System.out.println("\n"+sum);
//    }  //fibonacci


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String password = sc.nextLine();
//        String s="admin123";
//        if(s.equals(password)){
//            System.out.println("You are logged in");
//    }
//        else {
//            System.out.println("wrong password");
//        }


//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    while(true){
//      String a= sc.next();
//       if(a.equals("stop")){
//           break;
//       }
//    }
//}


//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int eded;
//    int sum=0;
//    while(true){
//        eded = sc.nextInt();
//        sum+=eded;
//        if(sum>=100){
//            break;
//        }
//
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//        int original=eded;
//        int reverse=0;
//        while(eded>0){
//            int d=eded%10;
//             reverse=reverse*10+d;
//             eded/=10;
//        }
//        if(original==reverse){
//            System.out.println("polindrom  eded");
//        }
//    }  //polindrom

}



