package Monday;

import java.util.ArrayList;

public class Student1 {
    String name;
    String surname;
    int age;
    static ArrayList<Student1> list=new ArrayList<Student1>();
    Student1(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    static void add(Student1 s){
        try{
        if(s.age>=18){
            list.add(s);
        }
        else{
            throw new IllegalArgumentException("Invalid Age");
        }}
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
 class Main{
    public static void main(String[] args) {
        Student1 s1 = new Student1("Arzu", "Nusratova", 23);
        Student1 s2 = new Student1("Gunel", "Allahverdiyeva", 17);
        Student1 s3 = new Student1("Lale", "Semedova", 10);
        Student1 s4 = new Student1("Gulchin", "Malikova", 27);
        Student1.add(s1);
       Student1.add(s2);
        Student1.add(s3);
Student1.add(s4);

        System.out.println(Student1.list);
    }
}
