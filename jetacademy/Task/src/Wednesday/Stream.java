package Wednesday;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Stream {
    /*public static void main(String[]args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<100;i++){
            list.add(i);
        }
        list.stream().filter(l->((l>10)&&(l%2==0))).forEach(l-> System.out.println(l));
    }
*/
   /* static void main() {
        String text = new Scanner(System.in).nextLine();
        Functional<String,Integer> f= String::length;
        System.out.println(f.function(text));

    }*/

   /* static void main() {
        List<String> list = List.of("Arzu","Gunay","Gunel","Zehra","Nigar","Gulchin","Meleyke");
        Length<List<String>> l=  s->s.stream().filter(t->t.length()>5).collect(Collectors.toList());
        System.out.println(l.length(list));
    }*/


   /* static void main() {
        List<String> list = List.of("Arzu","Gunay","Gunel","Zehra","Nigar","Gulchin","Meleyke");
        Upper<List<String>>l=s->s.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(l.upperCase(list));
    }*/

    /*static void main() {
        List<Employee> list = List.of(new Employee("Arzu", 5000), new Employee("Gunay", 2000), new Employee("Gunel", 3500));
list.stream().filter(l->l.getSalary()>3000).sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).map(Employee::getName).forEach(System.out::println);
    }*/
   /* static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<100;i++){
            list.add(i);
        }
        list.stream().filter(l->(l%2==1)).forEach(System.out::println);
    }*/
    /*static void main() {
        List<String> list = List.of("Arzu", "gunel", "Gunay","gulnara");
        list.stream().filter(f->(f.startsWith("a")||f.startsWith("A"))).forEach(System.out::println);
        list.stream().filter(f->(f.endsWith("a")||f.endsWith("A"))).forEach(System.out::println);
    }*/

   /* static void main() {
        List<String> list = List.of("alma", "armud", "heyva", "nar", "nar", "alma");
        list.stream().distinct().forEach(System.out::println);
    }*/
   static int max;
/*    static void main() {
        List<Integer> list = List.of(2,-8,90,123,8989,-90,4,77,9);
       // Optional<Integer> max = list.stream().max(Integer::compareTo);
        //System.out.println(max.get());

       max= list.getFirst();
        list.stream().forEach(
                (l)->{
                    if(l>max){
                        max=l;
                    }
                }
        );
        System.out.println(max);
    }*/


   /* static void main() {
        List<Integer> list = List.of(3, 6, 9, 90, -89, 2);
        *//*or(Integer l:list){
            System.out.println((l%2==0)?l+" cutdur":l+" tekdir");
        }*//*
        list.stream().forEach(
                 (l)->{

                     System.out.println((l % 2 == 0) ? (l + " cut") : (l + " tek"));}
        );
    }*/

   /* static void main() {
        List<Integer> list = List.of(5,12, 7, 8, -9, 9, 8, 9, 8, 6,12, 7, 6);
        Set<Integer> set = new HashSet<>();
        list.stream().forEach(
                l-> {
                    int c=0;
                    for(Integer d:list){
                        if(l.equals(d)){
                            c++;
                        }
                    }
                    if(c>1){
                        set.add(l);

                    }
                }
                );
        System.out.println(set);



    }*/

   /* static void main() {
        List<String> list = List.of("Arzu", "Gunay", "Gulchin", "Gunel", "Zehra", "Meleykey");
        list.stream().forEach(
                (e) -> {
                    if(e.length()>maxs){
                        maxs = e.length();
                        name = e;
                    }
                }
        );
        System.out.println(maxs);
        System.out.println(name);

//        OptionalInt max1 = list.stream().mapToInt(String::length).max();
//        for(String l:list){
//            if(l.length()==(max1).getAsInt()){
//                System.out.println(l+" "+max1);
//            }
//        }
    }
    static int maxs = 0;
    static String name = "";*/
   static int c=0;
/*    static void main() {
        List<Integer> list = List.of(2, 4, 6, -8, 78, 90,67,89,68,45);

        list.stream().forEach(
              e-> {
                  if(c<5)
                  System.out.println(e);
                      c++;
              }

        );
    }*/
static double sum=0;
static double product=1;
    static void main() {
        List<Integer> list = List.of(2, 1, -1,1, 2, 4);
        list.stream().map(l->
            sum+=l).toList();

        list.stream().map(l->
                product*=l).toList();
        System.out.println(sum);
        System.out.println(product);
        System.out.println(list.stream().mapToInt(Integer::intValue).count());
    }
}

@FunctionalInterface
interface Functional<T,R>{
    R function(T t);
}

@FunctionalInterface
interface Length <T>{
    T length(T t);
}

@FunctionalInterface
interface Upper<T>{
    T upperCase(T t);
}

class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}

/*
Nested collection-ları (yəni iç-içə olan list, set və s.) tək bir stream-ə düzləşdirir

Çox vaxt map() istifadə etdikdə yaranan Stream<Stream<T>> problemini həll edir

Yəni bir neçə stream-i birləşdirib tək stream yaradır*/
/*flatMap, bir konteyner (və ya kolleksiya/stream/optional) içindəki nested strukturlardan çıxan elementləri alıb tək bir konteynerdə
 birləşdirən əməliyyatdır.
 Container — içində digər obyektləri saxlayan obyekt və ya struktur.*/
/*
reduce(T identity,
       BiFunction<T, ? super U, T> accumulator,
       BinaryOperator<T> combiner)
3 parametr nədir?
1️⃣ identity
➡️ Başlanğıc dəyər

Reduce üçün “0 nöqtəsi”

Həmişə neytral olmalıdır

Məsələn:

cəm → 0

hasil → 1

String → ""

List → boş list

2️⃣ accumulator
➡️ Bir element gələndə nə edim?

identity + element

Tək-tək elementləri nəticəyə əlavə edir

java
Copy code
(acc, element) -> acc + element
3️⃣ combiner
➡️ Parallel stream zamanı nəticələri necə birləşdirim?

Stream paralel işləyəndə hər thread öz nəticəsini çıxarır

combiner bu nəticələri birləşdirir

⚠️ Sequential stream-də çox vaxt çağırılmır
⚠️ Parallel stream-də mütləq lazımdır

*/
