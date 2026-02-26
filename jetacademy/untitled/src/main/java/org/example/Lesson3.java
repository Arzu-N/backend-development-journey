package org.example;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {


//        int i = 10;
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String [] arr={"azercell1","azercell2","jet","azercell3"};
      //  int size=arr.length;
        int i=0;
        boolean flag=true;
        while(i<=(arr.length)-1){
           if(arr[i].equals(s)){
               System.out.println("istifadeci artiq var");
               flag=false;
               break;
           }
           i++;
        }
        if(flag){
            System.out.println("wrong");
        }

    }
}