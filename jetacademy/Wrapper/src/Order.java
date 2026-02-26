public class Order {
    Customer customer;
    Product[]products;
    Order(Customer customer,Product[] products){
        this.customer = customer;
        this.products = products;
    }
    double totalPrice(Product[]products){
        double total = 0;
        for(Product p:products){
            total+=p.price;
        }
        return total;
    }
}
