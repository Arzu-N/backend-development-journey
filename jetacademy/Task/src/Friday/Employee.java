package Friday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Employee {
    static long id=0;
    String firstname;
    String lastname;
    double salary;
    int age;
    String departament;
    Employee(String firstname,String lastname,double salary,int age,String departament){
        id++;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
        this.age=age;
        this.departament=departament;
    }

    public Employee(String firstname, double salary) {
        this.firstname = firstname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."Employee{firstname='\{firstname}', lastname='\{lastname}', salary=\{salary}, age=\{age}, departament='\{departament}'}";
    }

    static void main() {
        ArrayList <Employee>list = new ArrayList();

        list.add( new Employee("Arzu", "Nusratova", 3800, 23,"IT"));
        list.add( new Employee("Leyla", "Balayeva", 1200, 24,"Maliyye"));
        list.add( new Employee("Semed", "Nusratova", 3800, 25,"IT"));
        list.add( new Employee("Rasim", "Nusratova", 3800, 34,"HR"));
        list.add( new Employee("Melik", "Nusratova", 3800, 35,"HR"));

    List<Double> es = list.stream().filter(e->e.departament.equals("IT")).map(
            e->(e.salary*0.9)).toList();
        System.out.println("\n"+list);

        System.out.println("===============================");
        System.out.println(es);

            }}
   /* static void main() {

        List<Employee> aaa = new ArrayList<>();

        aaa.add(new Employee("Arzu",400));
        aaa.add(new Employee("Gunel",300));
        aaa.add(new Employee("Gunay",600));
        aaa.add(new Employee("Nemet",200));

        aaa.stream().filter(a -> a.salary > 300).map(a -> a.salary*10).forEach(System.out::println);
        System.out.println();
        System.out.println(aaa);
        ;*/

//        ArrayList<Employee> list = new ArrayList<>( );






