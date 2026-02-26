package Wednesday;

class NotificationSender<T> {

    T send(T notification){
        return notification;
    }
}
class A<T>{
     T method(T param){
         return param;
     }
}
class B<T extends Number>{
    T method(T param){
        return (T)param;
    }}
/*class Student<T,A>{
     private T name;
    private T surname;
    private A age;
    private T []language;
    Student(T name,T surname,A age,T []language){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.language=language;
    }

    public T getName() {
        return name;
    }

    public Student<T, A> setName(T name) {
        this.name = name;
        return this;
    }

    public T getSurname() {
        return surname;
    }

    public Student<T, A> setSurname(T surname) {
        this.surname = surname;
        return this;
    }

    public A getAge() {
        return age;
    }

    public Student<T,A> setAge(A age) {
        this.age = age;
        return this;
    }

    public T[] getLanguage() {
        return language;
    }

    public Student<T, A> setLanguage(T[] language) {
        this.language = language;
        return this;
    }

}*/

abstract class A1<T>{
    abstract T method(T param);

}
class StringAltClass extends A1<String>{
    @Override
    String method(String param) {
        return "hello "+param;
    }
}
class DoubleAltClass extends A1<Double>{
    @Override
    Double method(Double param) {
        return 2*param;
    }
}
class CharAltClass extends A1<Character>{
    @Override
    Character method(Character param) {
        return param;
    }
}

public class Task{
    /*public static void main(String[] args) {
        NotificationSender<String> obj1 = new NotificationSender<>();
        NotificationSender<Double> obj2 = new NotificationSender<>();

        System.out.println(obj1.send("salam"));
        System.out.println(obj2.send(34.6));
    }*/
    /*public static void main(String[] args) {
        var obj1 = new A<>();
        var obj2=new A<>();
        var obj3=new A<>();
        System.out.println(obj1.method("hello"));
        System.out.println(obj2.method(45.7));
        System.out.println(obj3.method('A'));
    }*/
    /*public static void main(String[] args) {
        B<Number> obj1 = new B<>();
       // B<String> obj2 = new B<>();
        B<Double> obj3 = new B<>();
        B<Integer> obj4 = new B<>();
        System.out.println(obj1.method(123));
        obj1.method(12.3);
       // obj1.method("hh");
    }*/
    /*public static void main(String[] args) {
        Student<String, Integer> o1 = new Student<>("Arzu", "Nusratova",23, new String[]{"java", "python"});
        System.out.println("adi: "+o1.getName()+"\nsoyad: "+o1.getSurname()+"\nyash: "+o1.getAge()+"\n" +
                "diller: "+ Arrays.toString(o1.getLanguage()));
            }*/
  /* *//* static String username="Arzu";
    static String password="arzu12";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username1 = sc.nextLine();
       String password1= sc.nextLine();
       try{
          validate(username1,password1);
       }
       catch(LoginException e){
           System.out.println(e.getMessage());
       }
        System.out.println(new Random().nextInt(2));*//*
    }*/
   /* public static void validate(String username1,String password1){
        if(username.equals(username1)&&password.equals(password1)){
            System.out.println("Welcome "+username1+"!");
        }else {
            throw new LoginException("Username or password is incorrect.");
        }
    }*/
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(10);

        while(true){
            int a1 = sc.nextInt();
        if(a==a1){ System.out.println("correct "+a);break;}
        else{
            System.out.println("incorrect");

    }}
    }*/
   /*public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       int a = random.nextInt(1,10);

       int []arr=new int[100];
       int i=0;
       int a1;
       boolean f=false;
       while(true){
            a1 = sc.nextInt();
if(a1!=0){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==a1){f=true;
        }}
           if(f){
               System.out.println(a1+" ededini evvel daxil etmisiniz");
           }
           else{
               arr[i]=a1;
                   i++;
           if(a==a1){ System.out.println("correct "+a);
               break;}
           else{

               System.out.println("incorrect  ");

           }}
       f=false;}

    else{
        System.out.println("0 dan ferqli eded daxil edin");
    }}}*/
    public static void main(String[] args) {
        StringAltClass o1 = new StringAltClass();
        DoubleAltClass o2 = new DoubleAltClass();
        CharAltClass o3 = new CharAltClass();
        System.out.println(o1.method("alma"));
        System.out.println(o2.method(45.7));
        System.out.println(o3.method('A'));
    }
}
