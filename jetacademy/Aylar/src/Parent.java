import java.util.Arrays;

public class Parent {
    private String name;
    private String surname;
    private int age;
    Child []children;
    Parent(String name, String surname, int age,Child []children) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public Parent setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Parent setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Parent setAge(int age) {
        this.age = age;
        return this;
    }

    public Child[] getChildren() {
        return children;
    }

    public Parent setChildren(Child[] children) {
        this.children = children;
        return this;
    }

      @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", children=" + children +
                '}';
    }
}
