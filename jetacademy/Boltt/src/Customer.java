public class Customer {
    private String name;
    private int orderCount=0;
    public Customer(String name) {
        this.name = name;
    }
    public void incrementOrder(){
       orderCount++;
    }
    public String getName(){
        return name;
    }
    public int getOrderCount(){
        return orderCount;
    }

}
