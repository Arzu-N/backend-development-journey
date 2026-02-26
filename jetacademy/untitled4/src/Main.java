import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   /* public static void main(String[] args) {
        PaymentProcessor obj1 = new CreditCardProcessor();
        PaymentProcessor obj2 = new PayPalProcessor();
        obj1.process(45);
        obj2.process(5);
    }*/

  /*  public static void main(String[] args) {
        UserLogger logger = new UserLogger();
        UserService userService = new UserService(logger);
        userService.createUser("Arzu");
        userService.deleteUser("Arzu");
    }*/

   /* public static void main(String[] args) {
        ArrayList<Shape> arr=new ArrayList<>();
        arr.add(new Circle(3));
        arr.add(new Rectangle(5,2));
        arr.add(new Triangle(5,8));
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.totalArea(arr);
    }*/
   /*public static void main(String[] args) {
       Dog dog = new Dog();
       Cat cat = new Cat();
       dog.sound();
       cat.sound();
   }*/

    /*public static void main(String[] args) {
        UserValidator userValidator=new UserValidator();
        UserServicee userService= new UserServicee(userValidator);

        userService.registerUser("Arzu");
    }*/

  /*  public static void main(String[] args) {
        AreaCalculatorr areaCalculatorr = new AreaCalculatorr();
        double v = areaCalculatorr.totalArea(Arrays.asList(new Circlee(3), new Square(5), new Trianglee(5, 6)));
        System.out.printf("%.2f", v);
    }*/

  /*  public static void main(String[] args) {
        SmartDevice[]arr={new SmartLight(),new SmartThermostat()};
        for(SmartDevice s:arr){
            s.turnOn();
            s.displayStatus();
            s.turnOff();
            s.displayStatus();
        }
    }*/

   /* public static void main(String[] args) {
        Book[]arr={new Novel(),new Magazine(),new ComicBook()};
        for(Book b:arr){
            b.displayInfo();
        }
    }*/

  /*  public static void main(String[] args) {
        Character[]arr={new Character("warrior",100),
                new Character("archer",80),
                new Character("mage",90),new Character("archer",50)};
        for(Character c:arr)
            System.out.println(c.getHealth());
        System.out.println("Total characters: "+Character.totalCharacters);
    }*/

   /* public static void main(String[] args) {
        Productt[]arr={new Electronics(49.5),new Clothes(56)};;
        for(Productt p:arr){
            System.out.println(p.getPrice()+" "+Productt.STORE_NAME);
        }
    }
*/

 /*   public static void main(String[] args) {
        Messenger[]m={new Whatsapp(),new Telegram()};
        MessageSender.sendAll(m,"salam");
    }*/

    public static void main(String[] args) {
        Course[]arr={new ProgrammingCourse("Java",200),new DesignCourse("Ui/Ux",70)};
        for(Course c:arr){
            c.displayInfo();
            ((Certificate)c).issueCertificate();
        }
        System.out.println("Total course count "+Course.totalCourse);
    }
}