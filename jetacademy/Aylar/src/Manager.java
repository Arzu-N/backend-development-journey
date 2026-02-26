public class Manager extends Employee{
    private double bonus;
    Manager(String name,String surname,int age,double salary,double bonus){
        super(name,surname,age,salary);
        this.bonus=bonus;
    }
    @Override
    double salary(){
        return this.getSalary()+((super.getSalary()*bonus)/100);
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
