
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Arzu");
        PricingService pricingService = new PricingService();
        for(int i=1;i<5;i++){
            Ride ride =new Ride(10);
            customer.incrementOrder();
        double v = pricingService.calculatePrice(customer,ride);


        System.out.println(i+"-ci sifaris "+ v);}
    }
}