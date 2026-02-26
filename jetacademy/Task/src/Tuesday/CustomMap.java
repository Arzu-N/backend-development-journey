package Tuesday;

public class CustomMap <K,V extends Debt>{
    K  key;
    V value;
    public CustomMap(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
     //   CustomMap<String, AzeriqazDebt> obj1 = new CustomMap<>("A", new AzeriqazDebt("Arzu", 5));
       var obj1 = new CustomMap<>("A", new AzeriqazDebt("Arzu", 5));
      // obj1.setKey(90);
       // CustomMap<String, AzerIshiqDebt> obj2= new CustomMap<>("A", new AzerIshiqDebt());
    }
}
