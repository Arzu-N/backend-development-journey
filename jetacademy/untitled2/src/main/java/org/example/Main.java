package org.example;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//Animal[]animal={new Cat("Cat"),new Dog("Dog")};
//for(Animal a:animal){
//    System.out.println(a.name);
//}
//    }

//    public static void main(String[] args) {
//        Shape[]shape={new Square(4,"red"),new Circle(3,"green")};
//        for(Shape s:shape)
//            System.out.println(s.area());
//    }

//    public static void main(String[] args) {
//        Employee[]e={new Developer("Arzu",5000),new Manager("Sevinc",100.5)};
//        int sum=0;
//        for(Employee e1:e){
//            sum+=e1.salary;} System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        Vehicle[]v={new Bike(10),new Car(50)};
//        for(Vehicle v1:v)
//            System.out.println(v1.speed+" ");
//    }


//    public static void main(String[] args) {
//        Animal1[]a={new Dog1(),new Bird()};
//        int i=0;
//       while(i<3){
//            for(Animal1 a1:a){
//                a1.makeSound();
//            }
//            i++;
//        }
//
//    }


//    public static void main(String[] args) {
//        Notification[]n={new EmailNotification("Welcome"),new SmsNotification("Welcome1"),new PushNotification("Welcome3")};
//        for(Notification n1:n){
//            n1.send();
//    }
//        int i=0;
//        while(i<n.length){
//            if(n[i]instanceof EmailNotification){
//                System.out.println(n[i].message);
//            }
//            i++;
//        }
//    }

//    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(new EBook(20,"History","Arzu"));
//        books.add(new PrintedBook(24,"Biology","Sevinc"));
//        books.add(new AudioBook(40.5,"Math","Leman"));
//        for(Book b:books){
//          b.info();
//        }
//        int i=0;
//        while(i<books.size()){
//            if(books.get(i)instanceof PrintedBook){
//                books.get(i).info();
//            }
//            i++;
//        }
//    }

//    public static void main(String[] args) {
//
//        Payment[]p={new CardPayment(200),new CashPayment(900),new CryptoPayment(2000)};
//   int sum=0;
//    for(Payment p1:p){
//        System.out.println(p1.finalAmount());
//        sum+=p1.finalAmount();
//    }
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        Transport[]t={new Car1("Car"),new Train("Train"),new Plane("Plane")};
//        double[] result=new double[t.length];
//        Random random = new Random();
//        for(int i=0;i<t.length;i++){
//            int km=10+random.nextInt(91);
//            result[i]=t[i].consumeEnergy(km);
//        }
//        double sum=0;
//        for(double x:result){
//            sum+=x;
//        }
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        Employee1[]e={new Developer1("Arzu",2000),new Designer("Lemab",800),new Manager1("Sevinc",700.6)};
//   for(Employee1 e1:e){
//       System.out.println(e1.bonusSalary());
//   }
//   int i=0;
//   while(i<e.length){
//       double bonus=e[i].bonusSalary()-e[i].salary;
//       if(bonus>300){
//           System.out.println(e[i].name+" "+bonus);
//       }
//       i++;
//   }
//    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Phone phone = new Phone();

        laptop.turnOn();
        phone.turnOn();
    }
}