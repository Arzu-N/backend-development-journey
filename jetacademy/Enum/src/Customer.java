public class Customer {
    private String name;
    private String surname;
    private int age;
    private int customerId;
    Customer(String name,String surname,int age,int customerId){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.customerId-=customerId;
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

    public int getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }
}
