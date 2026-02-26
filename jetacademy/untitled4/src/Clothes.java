public class Clothes extends Productt{
    double basePrice;
    Clothes(double basePrice){
    this.basePrice=basePrice;
    }
    @Override
    public double getPrice(){
        return basePrice-5;
    }
}
