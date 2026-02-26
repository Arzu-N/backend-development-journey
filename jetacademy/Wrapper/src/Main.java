import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  /*  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        *//*String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));*//*
        String s = sc.nextLine();
        String s1 = sc.nextLine();
     *//*   if(s.length()<7){
            System.out.println(s);
        }
        else{
            System.out.println("7den kicikdir");
        }*//*

        System.out.println("ilk herf: "+s.charAt(0)+"\nson herf: "+s.charAt(s.length()-1));

    }*/

    /*public static void main(String[] args) {
        Student s = new Student("Arzu",23);
        System.out.println(s);
    }*/
  /*  public static void main(String[] args) {
        Integer a=4;
        Integer b=7;
        System.out.println(Integer.toString(a)+Integer.toString(b));
    }*/

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration r = new Registration();
        String n = sc.next();
        String p=sc.next();
        r.validate(n,p);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[]products={new Product("trousers",25),new Product("T-shirt",20),new Product("Shoes",40)};
        Customer customer = new Customer("Arzu");
        Order order = new Order(customer, products);
        String password=sc.next();
        if(password.equals(customer.password)){
        for(Product p:products){
            System.out.println(p);
        }
        System.out.println(order.totalPrice(products));
    }
    else{
        System.out.println("Wrong password");
    }
}}