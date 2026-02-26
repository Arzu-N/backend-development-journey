package ocp;

public class PaypalPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("paypal");
    }
}
