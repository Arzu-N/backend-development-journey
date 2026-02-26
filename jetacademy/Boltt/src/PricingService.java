public class PricingService {
    private static final double km_price=2.0;
    public double calculatePrice(Customer customer,Ride ride){
                double basePrice=ride.getDistance()*km_price;
                if(customer.getOrderCount()>3){
                    basePrice*=0.8;
                }
                return basePrice;
    }
}
