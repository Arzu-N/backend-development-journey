public class Order {
    Customer customer;
    Menu[] menu ;
    public Order(Customer customer, Menu[] menu) {
        this.customer = customer;
        this.menu = menu;
    }
    double calculate(){
        double total = 0;
        for(int i=0;i<menu.length;i++){
            total+=menu[i].getPrice();
        }
        return total;
    }
    void printOrder(){
        for(int i=0;i<menu.length;i++){
            System.out.println(menu[i].getName()+" "+menu[i].getPrice());
        }
        System.out.println(calculate());
    }
}
