package Monday;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num=a;
        int rev=0;
        while(a>0){
          rev=rev*10+a%10;
          a/=10;
        }
        if(rev==num){
            System.out.println("polindromdur");
        }
    }
}
