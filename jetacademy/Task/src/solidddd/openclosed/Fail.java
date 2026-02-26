package solidddd.openclosed;

public class Fail {
    void calculateDiscount(double amount,String type){
        if(type.equals("new year"))
            System.out.println(amount*0.8);
        else if(type.equals("black friday"))
            System.out.println(amount*0.5);
    }
}
