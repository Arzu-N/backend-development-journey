import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private boolean isPaid;
    private LocalDate date;
    Customer(String name,String surname,int age,boolean isPaid,LocalDate date){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.isPaid=isPaid;
        this.date=date;
    }
    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Customer setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public Customer setPaid(boolean paid) {
        isPaid = paid;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Customer setDate(LocalDate date) {
        this.date = date;
        return this;
    }
}
