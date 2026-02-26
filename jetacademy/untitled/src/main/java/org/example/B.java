package org.example;

import java.util.Scanner;

public class B {
    public static void a(String a){
        char[]sait={'a','ı','e','ə','i','ö','ü','o','u'};
        int say=0;
        for (int i = 0; i <a.length(); i++) {
            for(int j=0;j<sait.length;j++){
                if(a.charAt(i)==sait[j]){
                    say++;
                }
            }
        }
        System.out.println(say);
    }
}
