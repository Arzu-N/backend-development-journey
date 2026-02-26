package Monday;

import java.util.*;

public class Task {
/*    static void main() {

        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String lng="";
        while(true){
            String name = sc.next();
            if(name.equalsIgnoreCase("exit")) break;
            if(!list.contains(name))list.add(name);
            else System.out.println(name+" adi listde var");
        }
        for(String n:list){
            if(n.length()>lng.length())lng=n;
        }
        System.out.printf("adlar:%s,\nadlarin sayi:%d,\nen uzun ad:%s ",list,list.size(),lng);
    }*/

    static void main() {
        User u1 = new User("Arzu", 23, 4000);

        int count=0;
        double sumSalary=0;
        List<User> list=Arrays.asList(new User("Arzu", 23, 6000),
                new User("Ayxan", 39, 1000),
                new User("Semed", 32, 500),
                new User("Gunay", 27, 4000),
                new User("Gunel", 24, 1200));
         User[] maxUser = {list.getFirst()};


        list.forEach(u->{

            if(u.salary> maxUser[0].salary) maxUser[0] =u;

        });
        System.out.printf("yasi 30-dan boyuk olan userler: %s,\nmaaslari 5000-den cox olan userler: \n%s," +
                        "\norta maas: %.2f,\nen yuksek maas alan user: %s,\nuserlerin yasa gore siralamasi: \n%s," +
                "\nyasi 25-40 arasi olan user sayi: %d,\nmaaslari cemi: %.2f"
                ,list.stream().filter(u->u.age>30).toList()
                ,list.stream().filter(u->u.salary>5000).toList()
                ,(list.stream().map(u->u.salary).reduce(0.0, Double::sum))/(list.size()),
                maxUser[0],
                list.stream().sorted(Comparator.comparing(u->u.age)).toList(),
                list.stream().filter(u->u.age>=25&&u.age<=40).count(),
                list.stream().map(u->u.salary).reduce(0.0, Double::sum));
    }


}
class User{
    String name;
    int age;
    double salary;
    User(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
