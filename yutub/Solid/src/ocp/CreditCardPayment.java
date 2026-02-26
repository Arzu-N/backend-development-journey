package ocp;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("creditcard");
    }
}
