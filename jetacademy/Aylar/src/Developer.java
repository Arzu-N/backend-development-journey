public class Developer extends Employee {
    private int overtime;
    Developer(String name, String surname, int age,double salary,int overtime) {
        super(name, surname, age,salary);
        this.overtime = overtime;
    }
    @Override
    double salary(){
        return this.getSalary()+(overtime*10);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", age=" + this.getAge() +
                ", salary=" + salary() +
                '}';
    }
}
