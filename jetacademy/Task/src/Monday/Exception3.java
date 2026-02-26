package Monday;

import java.util.Scanner;

public class Exception3 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String[]arr={"alma","armud","heyva","nar"};
        String s =  sc.next();
        try{
    find(arr,s);
}
catch(NotFoundFruit e){
    System.out.println(e.getMessage());
}
    }
        public static void find(String[]arr,String s){
boolean f=false;
        for(String a:arr){
            if((s.equals(a))){
               f=true;
               break;
            }
        }
        if(!f) throw new NotFoundFruit("meyve tapilmadi");
    }
}








