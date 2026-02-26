package Tuesday;

import java.util.Scanner;

public class Operation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        switch(n){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Yalnis operator");
        }

    }

}
