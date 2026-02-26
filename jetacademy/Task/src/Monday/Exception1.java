package Monday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
int heal=3;
        Scanner sc = new Scanner(System.in);
        while(heal>0){
       try {
           int a = sc.nextInt();
           break;
       }
       catch(InputMismatchException e){
           heal--;
           System.out.println("ededi duzgun formatda daxil edin, son "+heal+" cehd");
           sc.nextLine();
       }
    }}
}
