package Monday;

import java.util.Scanner;

public class Sade_murekkeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean f=false;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)
                f=true;
        }
        if(f) System.out.println("murekkeb");
        else System.out.println("sade");}}
