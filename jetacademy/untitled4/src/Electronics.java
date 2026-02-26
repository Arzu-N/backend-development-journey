public class Electronics extends Productt{
    double basePrice;
    Electronics(double basePrice){
    this.basePrice=basePrice;
    }
    @Override
    public double getPrice(){
        return basePrice*1.2;
    }
}
