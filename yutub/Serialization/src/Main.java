import java.io.*;

public class Main {
    public static void main(String[] args) {
     /*   Student obj = new Student("Arzu", 23,"arzu12");
        try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("student.serr"))){
            out.writeObject(obj);
            System.out.println("obyekt fayla yazildi");
        }
        catch(IOException e){
           e.printStackTrace();
        }*/
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.serr"))){
            Student s=(Student)in.readObject();
            System.out.println("oxundu");
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getPassword());
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}