package Friday;

import java.util.*;

public class Humann implements Comparable <Humann>{
    private String name;
    private int age;
    private double balance;
    Humann(String name,int age,double balance){
        this.name=name;
        this.age=age;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public Humann setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Humann setAge(int age) {
        this.age = age;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public Humann setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    @Override
    public String toString() {
        return "Humann{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }

    static void main() {
        List<Humann> list = Arrays.asList(new Humann("Arzu", 23,1000.0),
                new Humann("Gunay", 27,500.0), new Humann("Gunel", 23,200.0));
       /* Collections.sort(list);
        System.out.println(list);
        list.sort(new BalanceComparator());
        System.out.println(list);*/
        list.sort(Comparator.comparing(Humann::getAge).thenComparing(Humann::getBalance).reversed());
        System.out.println(list);

    }


    @Override
    public int compareTo(Humann o) {
        return this.getAge()-(o).getAge();
    }
}
class BalanceComparator implements Comparator<Humann> {

    @Override
    public int compare(Humann o1, Humann o2) {
        return  (int)(o1.getBalance()- o2.getBalance());
    }
}
