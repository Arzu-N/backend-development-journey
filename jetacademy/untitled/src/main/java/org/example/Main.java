

package org.example;

import java.util.Scanner;

//
//import java.util.Scanner;
//
public class Main {
/// /    public static void main(String[] args) {
/// /////        Vurma_cedveli a = new Vurma_cedveli();
/// /////        a.hesabla(4);
/// ///        Scanner sc = new Scanner(System.in);
/// ///
/// ///        Calculator a = new Calculator();
/// ///        while(true){
/// ///            int b=sc.nextInt();
/// ///            int c=sc.nextInt();
/// ///        a.calc(b,c);}
/// ///if()
/// ///    }
/// /    }
//
//
//
////public static void main(String[] args) {
//////    B b = new B();
//////    b.a("jkkfk");
//////    Scanner sc = new Scanner(System.in);
//////    int a=sc.nextInt();
//////    int b=sc.nextInt();
//////    int c=sc.nextInt();
//////    Edediorta edediorta = new Edediorta();
//////    System.out.println(edediorta.calc(a,b,c));
//////    Scanner sc = new Scanner(System.in);
//////    int a = sc.nextInt();
//////    Ebob ebob = new Ebob();
//////    ebob.ebob(a);
////
//////    Scanner sc = new Scanner(System.in);
//////    int eded=sc.nextInt();
//////    int size=sc.nextInt();
//////    int[]arr=new int [size];
//////    for (int i = 0; i <size; i++) {
//////        arr[i]=sc.nextInt();
//////    }
//////    C c = new C();
//////    for(int i=0;i<(c.min(arr,eded)).length;i++){
//////        System.out.println(c.min(arr,eded)[i]);
//////    }
////    Scanner sc = new Scanner(System.in);
////    Calculator c = new Calculator();
////    while(true){
////    System.out.println("enter a number");
////    String a = c.enter(sc);
////    if(a.equalsIgnoreCase("x")){
////        break;
////    }
////    System.out.println("enter another number");
////    String b=c.enter(sc);
////    if(b.equalsIgnoreCase("x")){
////        break;
////    }
////        System.out.println("enter operator");
////    String op=c.enter(sc);
////    if(op.equalsIgnoreCase("x")){
////        break;
////    }
////        System.out.println(c.calc(Integer.parseInt(a),Integer.parseInt(b),op));
////}
////    System.out.println("program finished");
////}
////public static void main(String[] args) {
////    Task13 task13 = new Task13();
////    System.out.println(task13.square(12));
////
////}
////public static void main(String[] args) {
////    Task14 task14 = new Task14();
////    System.out.println(task14.printName("Arzu"));
////}
//
////public static void main(String[] args) {
////    Task15 task15 = new Task15();
////    System.out.println(task15.max(0,9));
////}
////public static void main(String[] args) {
////    Task16 task16 = new Task16();
////    Scanner sc = new Scanner(System.in);
////    int a = sc.nextInt();
////
////    System.out.println(task16.sum(a));
////task16.sum1(a);
////}
////public static void main(String[] args) {
////    Polindrom p = new Polindrom();
////    Scanner sc = new Scanner(System.in);
////    String a = sc.next();
////    System.out.println(p.a(a));
////
////}
////public static void main(String[] args) {
//////    Cat cat = new Cat();
//////    Dog dog = new Dog();
//////    cat.voice();
//////    dog.voice();
////    Ortalama o = new Ortalama();
////    Scanner sc = new Scanner(System.in);
////    int a = sc.nextInt();
////    int b = sc.nextInt();
////    int c= sc.nextInt();
////    System.out.println(o.hesabla(a,b,c));
////}
//
////sade
////public static void main(String[] args) {
////    Soz soz = new Soz();
////    Scanner sc = new Scanner(System.in);
////    String a = sc.next();
////    soz.say(a);
////
////}
//
//


//public static void main(String[] args) {
//
//    Human human = new Human("Arzu");
//    human.sayHi();
//    human.sayBye();
//
//}
//public static void main(String[] args) {
//   Student s1 = new Student(23,"Arzu","Nusratova");
//    Student s2 = new Student(20,"Gunel","Memmedova");
//    Student s3 = new Student(30,"Sema","Babayeva");
//    System.out.println(s1.firstName+" "+s1.surname+" "+s1.age+"\n"+s2.firstName+" "+s2.surname+" "+s2.age+"\n"+s3.firstName+" "+s3.surname+" "+s3.age);
//
//}
//public static void main(String[] args) {
//    Author a1 = new Author("Arzu", "Baku");
//    Author a2 = new Author("Nermin", "Ganja");
//    Book b1 = new Book("java", 100.5, a1);
//    Book b2 = new Book("python", 15, a2);
//    Book b3 = new Book("c++", 50, a1);
//   Book[] bk={b1,b2,b3};
//   for(int i=0;i<bk.length;i++){
//       if(bk[i].price>20)
//           System.out.println(bk[i].title+" "+bk[i].author+" "+bk[i].price);
//   }
//}
//public static void main(String[] args) {
//    BankAccount ac = new BankAccount("Arzu",2000);
//    ac.deposit(500);
//    ac.withdraw(200);
//}
//public static void main(String[] args) {
//    Phone phone = new Phone("samsung", 2000);
//    System.out.println(phone.brand+" "+phone.price);
//}
//public static void main(String[] args) {
//    Rectangle rectangle = new Rectangle(2.3, 4);
//    rectangle.area(rectangle.width, rectangle.height);
//
//}
//public static void main(String[] args) {
//    Address a1 = new Address("Baku","Javadkhan street");
//    Address a2 = new Address("Baku","Narimanov street");
//    Studnt s1 = new Studnt("Arzu", 23, a1);
//    Studnt s2 = new Studnt("Sema", 22, a2);
//    System.out.println(s1.name+" "+s1.age+" "+s1.address.city+" "+s1.address.street);
//    System.out.println(s2.name+" "+s2.age+" "+s2.address.city+" "+s2.address.street);
//
//}
//public static void main(String[] args) {
//    Employee e1 = new Employee("Arzu", 2000);
//    Employee e2= new Employee("Sema", 3000);
//    Employee e3 = new Employee("Rufet", 500);
//    Employee[] employee = {e1,e2,e3};
//    Company c = new Company("ABB", employee);
//    System.out.println(c.employee[0].salary+" "+c.employee[1].salary+" "+c.employee[2].salary);
//}

//public class Main {
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.method2();
//    }
//}
//public static void main(String[] args) {
//    City city = new City("Baku",10000000,"Azerbaijan");
//    City city1 = new City("Ganja",80000,"Azerbaijan");
//    City city3 = new City("Khanchmaz",10000,"Azerbaijan");
//    City city4= new City("Agdam",20000000,"Azerbaijan");
//    City city5 = new City("Kudat",10000,"Azerbaijan");
//    City[]arr={city,city1,city3,city4,city5};
//    for(City c:arr){
//        if(c.population>1000000)
//            System.out.println(c);
//    }
//
//
//}
//public static void main(String[] args) {
//
//    Director d = new Director();
//    d.companyBudget = 100;
//    d.salary = 200;
//    d.name="arzu";
//    d.bonus = 100;
//    System.out.println(d.name+" "+d.bonus+" "+d.salary+" "+d.companyBudget);
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    Product p = new Product();
//
//    DiscountedProduct[] d2 = new DiscountedProduct[3];
//    for(int i=0;i<3;i++){
//        DiscountedProduct d = new DiscountedProduct();
//        String name=sc.next();
//        double price=sc.nextDouble();
//        double discountPercent=sc.nextDouble();
//        d.name=name;
//        d.price=price;
//        d.discountPercent=discountPercent;
//        d2[i]=d;
//    }
////    for (int i=0;i<d2.length;i++){
////        d2[i].printInfo();
////    }
//    int i=0;
//    int s=sc.nextInt();
//while(s!=0&&i<3){
//
//
//        if(s==1)
//        d2[i].printInfo();
//        if(s==2){
//        if(d2[i].discountPercent>20)
//        d2[i].printInfo();}
//        if(s==3){
//        if(d2[i].finalPrice()<10)
//            d2[i].printInfo();}
//        i++;
//    }
//}  48ob6AhNFjoD
//public static void main(String[] args) {
//
//    Carr car = new Carr();
//    car.move();
//    car.drive();
//}
//public static void main(String[] args) {
//    Square s = new Square();
//    s.color="red";
//    s.side=5;
//    s.printColor();
//    s.area();
//    Circle c = new Circle();
//    c.color="green";
//    c.radius=3;
//    c.printColor();
//    c.area();
//}
//public static void main(String[] args) {
//    SavingAccount sa = new SavingAccount(2000);
//    Checking c = new Checking(4000);
//    sa.monthlyUpdate();
//    c.monthlyUpdate();
//}
//public static void main(String[] args) {
//    EBook eBook = new EBook();
//    PrintBook printBook = new PrintBook();
//    eBook.pageCount=300;
//    eBook.author="Arzu";
//   printBook.pageCount=500;
//   printBook.author="a";
//    System.out.println(eBook.pageCount+" "+eBook.author+"\n"+printBook.pageCount+" "+printBook.author);
//
//
//}
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int a=sc.nextInt();
//    int b=sc.nextInt();
//    String e=sc.next();
//    ACalc c = new ACalc();
//    c.add(a,b,e);
//    c.subtract(a,b,e);
//    c.multiply(a,b,e);
//    c.divide(a,b,e);
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String m=sc.nextLine();
//
//    EmailNotification e = new EmailNotification(m);
//    SmsNotification s = new SmsNotification(m);
//    e.send();
//
//}
/*public static void main(String[] args) {
    Circle1 c = new Circle1();
    Square1 s = new Square1();
    c.draw();
    s.draw();
}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    Car1 v=new Car1(n);
    Bike v1=new Bike(n);

     v.start();
     v1.start();
}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
  if(n.equals("cash")){
      new CardPayment().pay();
  }
  else if(n.equals("card")){
      new CardPayment().pay();
  }

}*/
/*public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(n.equals("+"))
        new AddOperation().calculate(a,b);
    else if(n.equals("-"))
        new SubOperation().calculate(a,b);
    else if(n.equals("*"))
        new MulOperation().calculate(a,b);
    else if(n.equals("/"))
        new DivOperation().calculate(a,b);
}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    if(n.equals("pdf"))
        new PdfDocument().read();
    else if(n.equals("text"))
        new TextDocument().read();
    else if(n.equals("word"))
        new WordDocument().read();
    else new Document().read();
}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    double p = sc.nextDouble();
    if(n.equals("regular"))
        new RegularProduct(p).getPrice();
    else if(n.equals("student"))
        new StudentProduct(p).getPrice();
    else if(n.equals("vip"))
        new VipProduct(p).getPrice();


}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String u = sc.next();
    String p = sc.next();
    if(u.startsWith("admin"))
        System.out.println(new AdminAuth().authenticate(u,p));
    else if(u.startsWith("user"))
        System.out.println(new UserAuth().authenticate(u,p));
}*/
/*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String t=sc.next();
    if(n.equals("upper"))
        new UppercaseEncoder().encode(t);
    else if(n.equals("lower"))
        new LowercaseEncoder().encode(t);
    else if(n.equals("reverse"))
        new ReverseEncoder().encode(t);
}*/
/*public static void main(String[] args) {
    FulltimeEmployee a = new FulltimeEmployee("Arzu", 49958);
    System.out.println(a.name+" "+a.salary);

}*/
/*public static void main(String[] args) {
    Car2 c = new Car2("Toyota",5858);
    System.out.println(c.brand+" "+c.maxSpeed);
}*/
/*public static void main(String[] args) {
    Dog2 d = new Dog2("Dog",2,"d");
    System.out.println(d.name+" "+d.age+" "+d.breed);

}*/
/*public static void main(String[] args) {
    SavingAccount2 a = new SavingAccount2("Arzu", 80);
    System.out.println(a.owner+" "+a.interestRate);
}*/
/*public static void main(String[] args) {
    FoodProduct foodProduct = new FoodProduct("Bread","04.12.2025");
    System.out.println(foodProduct.expirationDate+" "+foodProduct.productName);
}*/
/*public static void main(String[] args) {

    new Phone1("samsung","a10").info();
}*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    if(n.equals("plane"))
        new Plane().move();
    else if(n.equals("car"))
        new Car3().move();
    else if(n.equals("train"))
        new Train().move();
}
}