public class Car {
    private String name;
    private double distance;
    static int orderCount=0;
    double price=1.5;
    public Car(double distance){
       this.distance=distance;
    }
    public void getPrice(){
        orderCount++;
        price=distance*price;
        if(orderCount>3){
            System.out.println(price*0.8);
        }
        else{
            System.out.println(price);
        }
    }
}
