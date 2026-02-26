public class Animal<T,S,B,K> {
    T name;
    K age;
    Animal(T name,K age){
        this.name=name;
        this.age=age;
    }
    public T getName(){
        return name;
    }
    public K getAge(){
        return age;
    }
}
