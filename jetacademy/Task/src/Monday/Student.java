package Monday;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private int dateOfBirth;
    Student(String name,String surname,int dateOfBirth){
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public Student setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public int age(){
        LocalDate now = LocalDate.now();
        int age=now.getYear()-dateOfBirth;
        return age;
    }
    @Override
    public String toString() {
        return "task1.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age() +'\''+
                "}";
    }
}
