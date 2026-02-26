package Thurday;
import java.util.Arrays;
import java.util.Scanner;
public class Task {
/*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={5,7,0,-9,12,90};
        int n = sc.nextInt();
        boolean f=false;
        try{
        for(int a:arr){
            if(n==a){
                f=true;
            }
        }
        if(f){
            System.out.println("var");
            return;
        }
        throw new NotFound("element tapilmadi");
    }
        catch(NotFound e){
            System.out.println(e.getMessage());
        }
}*/
/* public static void main(String[] args) {
        GenericClass<String> obj = new GenericClass<>("Hello");
        System.out.println(obj.method());
    }}
class GenericClass<T>{
        T a;
        GenericClass(T a){
            this.a=a;
        }
        public T method(){
            return a;
        }*/
/*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heal=5;
        String a;
       while(heal>0){
            a = sc.next();
        try{
            int a1 = Integer.parseInt(a);
            System.out.println(a1);
            break;
        }
        catch(Exception e){
            heal--;

        }
    }}*/
/*  public static void main(String[] args) {

      Marka marka = new Marka(( new Telephone[]{new Telephone( 64, 2000,Color.Red),new Telephone(64,5000,Color.Blue)}),"Samsung");
      System.out.println(marka);
  }*/
}
/*class Marka{
    String name;
       Telephone[]arr;
       Marka(Telephone[]arr,String name){
           this.arr=arr;
           this.name=name;
       }
      @Override
      public String toString() {
          return "Marka{ " +name+
                  "\narr=" + Arrays.toString(arr) +
                  '}';
      }
  }
  class Telephone{

        double storage;
        double price;
        Color color;
        Telephone(double storage,double price,Color color){

            this.storage=storage;
            this.price=price;
            this.color=color;
        }

      @Override
      public String toString() {
          return "\nTelephone{" +

                  " storage=" + storage +
                  ", price=" + price +", color=" + color +
                  '}'+"\n";
      }
  }
  enum Color{
    Red,Green,Blue,Yellow
  }*/