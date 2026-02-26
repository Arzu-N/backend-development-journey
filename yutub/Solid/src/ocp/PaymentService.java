package ocp;

public class PaymentService {
    public static void main(String[] args) {
        Payment pay=new PaypalPayment();
        pay.pay();
    }

}
