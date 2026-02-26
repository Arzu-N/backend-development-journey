package org.example;

import java.util.Scanner;

public class Calculator{
      public static String enter(Scanner sc){
         return sc.next();
      }
      public static int calc(int a,int b,String op){
          switch(op){
              case "+":
                  return a+b;

              case "-":
                  return a-b;
              case  "*":
                  return a*b;
              case "/":
                  return a/b;

              default:
                  System.out.println("wrong operator");
                  return 0;
          }
      }
}