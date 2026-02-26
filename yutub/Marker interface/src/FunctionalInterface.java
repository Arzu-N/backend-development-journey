@java.lang.FunctionalInterface
interface MyFunction{
    void test();
     static void staticHello(){
        System.out.println("staticHello");
    }
    default void defaultHello(){
        System.out.println("defaulthello");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {


       MyFunction f1=()-> System.out.println("salam1");
       f1.test();
    //   f1.staticHello();
       f1.defaultHello();
    }
}