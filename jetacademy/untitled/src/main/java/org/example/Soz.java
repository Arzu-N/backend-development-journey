package org.example;

import java.util.Scanner;

public class Soz {
    public static void say(String a){
      int s;

        for(int i=0;i<a.length();i++){
            boolean f=false;

            int count=0;
            for(int j=0;j<a.length();j++) {
                if (a.charAt(j) == a.charAt(i)) {
                    count++;
                }}
                for (int z = 0; z < i; z++) {
                    if (a.charAt(z) == a.charAt(i)) {
                        f = true;
                        break;
                    }
                }
            if (f)
                continue;

            if(count>1)
            System.out.println(a.charAt(i)+" "+count);

        }
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        say(s);
    }
}
