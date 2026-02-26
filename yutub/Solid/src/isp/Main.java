package isp;

public class Main {
   static  void fly(Flying fly){
        fly.fly();
    }

    public static void main(String[] args) {
        fly(new Sparrow());
        //fly(new Ostrich())
    }
}
