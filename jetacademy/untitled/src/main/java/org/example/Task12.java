package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded = sc.nextInt();
//        if(eded>0){
//            System.out.println("positive");
//        }
//        else if(eded<0){
//            System.out.println("negative");
//        }
//        else{
//            System.out.println("zero");
//        }
//    }


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int eded=input.nextInt();
//        if(eded>0){
//        for (int i = 1; i<eded ; i++) {
//            System.out.print(i+" ");
//
//        }}
//        else{
//            for (int i=1; i>eded ; i--) {
//                System.out.print(i+" ");
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        while (true) {
//            int eded = sc.nextInt();
//            sum += eded;
//            if (eded == 0) {
//                System.out.println(sum);
//                break;
//            }
//        }
//    }


//    public static void main(String[] args) {
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }


//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + " ");
//                sum += i;
//            }
//        }
//        System.out.println("\n" + sum);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random();
//        int randomEded = random.nextInt(100) + 1;
//        int eded = 0;
//        int cSayi = 0;
//        while (eded != randomEded) {
//            eded = sc.nextInt();
//            cSayi++;
//            if (eded == randomEded) {
//                System.out.println("Tebrikler,tapdin! cehd sayi " + cSayi);
//            } else if (eded > randomEded) {
//                System.out.println("Cox boyukduur");
//            } else {
//                System.out.println("Cox kicikdir");
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//        String reverse = "";
//        int length = word.length();
//        for (int i = length - 1; i >= 0; i--) {
//            reverse = reverse + word.charAt(i);
//        }
//        if (reverse.equals(word)) {
//            System.out.println("polindrome");
//        } else {
//            System.out.println("not polindrome");
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//        int sum=0;
//        while(eded!=0){
//           sum+=(eded%10);
//           eded/=10;
//        }
//        System.out.println(sum);
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < 10; i++) {
//            int eded = sc.nextInt();
//            if (eded < min) {
//                min = eded;
//            }
//            if (eded > max) {
//                max = eded;
//            }
//        }
//        System.out.println("en kicik eded: " + min + "\nEn boyuk eded: " + max);
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//
//        for (int i = 1; i <=eded ; i++) {
//            for(int j=1;j<=(eded-i);j++){
//                System.out.print(" ");
//            }
//            for(int z=1;z<=(i*2)-1;z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//        int priv=eded%10;
//        eded=eded/10;
//        int count=1;
//        while(eded>0){
//            int curr=eded%10;
//            if(curr==priv){
//                count++;
//            }
//            else{
//                System.out.println(priv+" reqemi "+count+" defe daxil edilib");
//                count=1;
//            }
//
//            priv=curr;
//eded=eded/10;
//        }
//        System.out.println(priv+" reqemi "+count+" defe daxil edilib");
//    }






//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int eded=sc.nextInt();
//                    int yuz=eded/100;
//
//            int elli=(eded%100)/50;
//            int iyirmi=((eded%100)%50)/20;
//            int on=(((eded%100)%50)%20)/10;
//            int bes=(((((eded%100)%50)%20)%10)/5);
//            int bir=((((eded%100)%50)%20)%5);
//
//               System.out.println(yuz+" yuz ");
//
//
//                System.out.println(elli+" elli ");
//
//               System.out.println(iyirmi+" iyirmi ");
//               System.out.println(on+" on ");
//
//
//               System.out.println(bes+" bes ");
//
//
//               System.out.println(bir+" bir ");
//
//           }



//    public static void main(String[] args) {
//        int[]a={100,50,20,10,1};
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        for(int i=0;i<a.length;i++){
//
//
//                System.out.println((b/a[i])+"-->"+a[i]+" eded");
//
//                        b=b%a[i];
//
//        }
//    }


//        public static void main(String[] args) {
//            System.out.println(check("79927398713"));
//        }
//
//
//        public static boolean check(String p){
//            boolean flag=false;
//            int sum=0;
//            for(int i=p.length()-1;i>=0;i--){
//                int d=p.charAt(i)-'0';
//                if(flag){
//                    d*=2;
//                    if(d>9){
//                        d=d%10+d/10;}}
//                sum+=d;
//                flag=!flag;
//            }
//            return sum%10==0;}  //lunh alqoritmi




    }





