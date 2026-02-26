public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean process(double amount) {
        System.out.println("Credit Card Processor "+amount);
        return true;
    }
}
