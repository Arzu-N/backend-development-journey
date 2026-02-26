package Friday;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Human {
    private String name;
    private String country;
    Human(String name,String country){
        this.name=name;
        this.country=country;
    }

    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Human setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    static void main() {
        List<Human> list = List.of(new Human("Arzu", "Azerbaijan"), new Human("Samra", "Russian"),
                new Human("Anna", "Russian"), new Human("Arzu", "Azerbaijan"),
                new Human("John", "USA"));
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Human::getCountry, Collectors.counting()));
        System.out.println(map);

    }
}
