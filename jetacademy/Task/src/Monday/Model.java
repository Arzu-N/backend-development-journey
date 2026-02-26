package Monday;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Model {
    String model;
    double capasity;
    String color;
    double price;
    LocalDate releaseDate;

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", capasity=" + capasity +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public Model(String model, double capasity, String color, double price, LocalDate releaseDate) {
        this.model=model;
                this.capasity=capasity;
        this.color=color;
        this.price=price;
        this.releaseDate=releaseDate;


    }
}
class Marka{
    String brand;
    List<Model> list;
    Marka(String brand,List<Model> list){
        this.brand=brand;
        this.list=list;
    }

    @Override
    public String toString() {
        return "Marka{" +
                "brand='" + brand + '\'' +
                ", list=" + list +
                '}';
    }

    public static void main(String[] args) {
        Model iphone17 = new Model("Iphone17", 64, Color.RED.getColor(), 3000, LocalDate.of(2025, 11, 12));
        Model iphone16 = new Model("Iphone16", 32, Color.YELLOW.getColor(), 2000, LocalDate.of(2024, 10, 2));

        List<Model>list1= Arrays.asList(iphone17,iphone16);

        Model A15 = new Model("A15", 32, Color.BLUE.getColor(), 2100, LocalDate.of(2023, 10, 12));
        Model A32 = new Model("A32", 64, Color.RED.getColor(), 1000, LocalDate.of(2024, 9, 1));

        List<Model>list2= Arrays.asList(A15,A32);

        Marka iphone = new Marka("Iphone", list1);
        Marka samsung = new Marka("Samsung", list2);

        System.out.println(iphone+"\n");
        System.out.println(samsung);
    }
}
