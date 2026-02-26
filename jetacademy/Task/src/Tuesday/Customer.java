package Tuesday;

import java.util.Map;

public class Customer {
    String name;
    Map<Product,Integer> products;
   static double balance;
    Customer(String name,Map<Product,Integer>products,double balance){
        this.name=name;
        this.products=products;
        this.balance=balance;
    }

    public void buy(){
        double sum = 0;
        for(Map.Entry<Product,Integer> e: products.entrySet()){
            sum+=((e.getKey().price)*e.getValue());

        if(balance>=sum){
            if(e.getValue()>=e.getKey().count){
            balance-=sum;
            System.out.println(e.getKey().price+" qiymetli "+e.getKey().name+" "+e.getValue()+" eded alindi "+balance);
        }
            else{
                System.out.println("stokda mehsul sayi bitib");
            }
        }
          else{
            System.out.println("pul catmir");
        }

            sum=0;
}
    }

    static void main() {
        Product kitab = new Product("Kitab", 25,2);
        Product qelem = new Product("qelem", 2,1);
        Product defter = new Product("defter", 5,3);
        Map<Product, Integer> products = Map.of(kitab, 2, qelem, 3, defter, 2);
        Customer customer = new Customer("Arzu", products, 200);
        customer.buy();
    }

}
