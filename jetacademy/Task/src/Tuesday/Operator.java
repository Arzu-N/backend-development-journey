package Tuesday;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Operator {
    static void main() {
        List<Character> list = List.of('+', '-', '/', '*', '%');
        Scanner sc = new Scanner(System.in);
        String[] split=null;
        String s = sc.nextLine();
        char o=' ';
        for(Character c:list){
        if(s.indexOf(c)!=-1){
            split = s.split(String.valueOf("\\"+c));
            o=c;
            break;
        }}
        if(split!=null){
            try{
       switch(o){
           case '+':
               System.out.println(Integer.parseInt(split[0])+Integer.parseInt(split[1]));
               break;
           case '-':
               System.out.println(Integer.parseInt(split[0])-Integer.parseInt(split[1]));
               break;
           case '*':
               System.out.println(Integer.parseInt(split[0])*Integer.parseInt(split[1]));
               break;
           case '/':
               System.out.println(Integer.parseInt(split[0])/Integer.parseInt(split[1]));
               break;
           case '%':
               System.out.println(Integer.parseInt(split[0])%Integer.parseInt(split[1]));
               break;

       }}
            catch(NumberFormatException e){
                System.out.println("Yalniz eded daxil etmek olar,simvol yox");
            }

    }}
}