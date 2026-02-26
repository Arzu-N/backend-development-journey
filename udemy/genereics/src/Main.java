import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Mercedes mercedes=new Mercedes();
      BMW bmw =new BMW();
Mycar1<Mercedes,BMW>mycar1=new Mycar1<>();
        Mercedes car1 = mycar1.getCar1();
        BMW car2 = mycar1.getCar2();
        Integer i = mycar1.supergetCar1();
        String s = mycar1.supergetCar2();
        String s1 = Main.<String>foo("Salam");
        Mycar <String> mycar=new Mycar<>();
        fooo(mycar);

    }

    public static <T> T foo(T parametr){
        return parametr;
    }
    public static void fooo(Mycar <?>parametr){
        parametr.getCar();
    }
}