package Tuesday;

public class Human<T> {
  //  Object borc;
    T borc;
    Human(T borc){
        this.borc = borc;
    }

    public Object getBorc() {
        return borc;
    }

    public Human setBorc(T borc) {
        this.borc = borc;
        return this;
    }

    public static void main(String[] args) {
        AzeriqazDebt qaz = new AzeriqazDebt("Arzu", 20);
        AzerSuDebt su = new AzerSuDebt("Arzu",10);
        //Human <AzerSuDebt>human = new Human<>(su);
        var human=new Human<>(su);
        human.setBorc(su);
        System.out.println(human.getBorc());
    }

}
