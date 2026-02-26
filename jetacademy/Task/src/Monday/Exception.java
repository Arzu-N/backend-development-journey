package Monday;

public class Exception {
    public static void main(String[] args) {


    String a=null;
    try{
        System.out.println(a.length());
    }
    catch(NullPointerException e){
        e.printStackTrace();
    }

}}
