//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Telephone s1 = new Telephone("Samsung", Color.RED, 64,470);
        Telephone s2 = new Telephone("Redmi", Color.GREEN, 32,1000.50);
        Telephone[]t={s1,s2};

        for(Telephone t1:t){
            System.out.println("reng "+t1.getColor().getValue()+" model "+t1.getModel()+" capasity "+t1.getCapacity());

        }
        System.out.println("telefon sayi "+Telephone.count);
        System.out.println("telefonlarin umumi qiymeti "+Telephone.sum);
    }
}