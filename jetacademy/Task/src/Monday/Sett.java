package Monday;

import java.util.HashSet;
import java.util.Scanner;

public class Sett {
   public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       HashSet<Integer> set = new HashSet<>();
       set.add(a);
       while(a!=-1){
           a = sc.nextInt();

           if(set.contains(a)){
               System.out.println("eded sette var");
               continue;
           }
           set.add(a);
       }
       System.out.println(set);

   }
}

