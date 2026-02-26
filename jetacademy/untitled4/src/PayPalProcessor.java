public class PayPalProcessor implements PaymentProcessor {
    public boolean process(double amount) {
        System.out.println("PayPal Processor "+amount);
        return true;
    }
}
