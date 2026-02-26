import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
   transient private String password;
    public Student(String name, int age,String pasword) {
        this.name = name;
        this.age = age;
        this.password = pasword;
    }
    public void info(){
        System.out.println("Name : " + name+" "+"Age : " + age+" "+"Password : "+password);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
