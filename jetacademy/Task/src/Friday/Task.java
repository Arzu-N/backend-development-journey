package Friday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task {
   /* public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(-78);
        arr.add(11);
        arr.add(17);

        for(Integer a:arr){
            if(a%2==0) System.out.println(a+" cut ededdir");
            else System.out.println(a+" tek ededdir");
        }
    }*/
    /*public static void main(String[] args) {
       int length=0;
      int  t=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
               length++;
            }
        }
        int[]arr=new int[length];
      for(int i=0;i<=100;i++){
         if(i%2==0) arr[t++]=i;
      }

    for(int i:arr) System.out.print(i+" ");
}*/

 /*   public static void main(String[] args) {
        int[]arr={3,6,8,90,0,-7,4,89,-5,1};
        int t;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }*/

   /* public static void main(String[] args) {
        int[]arr={3,6,8,90,0,-7,4,89,-5,1};
       int t;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("siralanmis Array "+Arrays.toString(arr));
        int target=89;
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }*/
   /* public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<=100;i++){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        System.out.println("Cut list "+even+"\n");
        System.out.println("tek list "+odd);
    }*/

    /*public static void main(String[] args) {
        List<Integer> list=  List.of(3,6,7,1,3,7,1,-9,3,6,79);
        ArrayList<Integer> list2= new ArrayList<>();

        for(int i=0;i<list.size();i++){
            boolean f=false;

            for(int j=0;j<list.size();j++){
                if(i!=j && Objects.equals(list.get(i), list.get(j))){
                    f=true;
                    break;
                }
            }
            if(!f){
                list2.add(list.get(i));
            }

        }
        System.out.println(list2);
    }*/

    /*public static void main(String[] args) {
        List<String> list = List.of("alma","armud","heyva","alma","nar","alma");

        String f="alma";
        int count=0;
        int index=0;
        for(String s: list){
            if(f.equals(s)){
            count++;
            System.out.print("rast gelindiyi index :"+index+"\n");}
            index++;
        }
        System.out.println("\n"+count);
    }*/
    public static void main(String[] args) {
        Student student = new Student("Arzu","Nusratova",23);
        Student student1 = new Student("Gunay","Allahverdiyeva",27);
        Student student2 = new Student("Gunel","Suleymanova",24);
        Student.add(student);
        Student.add(student1);
        Student.add(student2);
      //  System.out.println(Student.getStudents());
        for(Student s:Student.getStudents()){
            if(s.getAge()>23) System.out.println(s);
        }
    }

}
class Student{
    private String name;
    private String surname;
    private int age;
    private static ArrayList<Student> list =new ArrayList<>();

    Student(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
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

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public Student setList(ArrayList<Student> list) {
        this.list = list;
        return this;
    }

    @Override
    public String toString() {
        return '{'+name + " " +
                surname + " " +
                age +

                '}';
    }
    public static void add(Student s){
        list.add(s);
    }
    public static ArrayList<Student> getStudents(){
        return list;
    }


}