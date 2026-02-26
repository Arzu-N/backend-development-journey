package Tuesday;

import java.util.*;

public class Stream {
    static int count=0;
/*    static void main() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Arzu",90);
        map.put("Gunay",85);
        map.put("Nemet",40);
        Set<String> sets = new HashSet<>();
        //map.entrySet().stream().filter(l->l.getValue()>80).forEach(System.out::println);
        //System.out.println(map.entrySet().stream().filter(l->l.getValue()<50).count());
//        map.entrySet().removeIf(e -> e.getValue() < 50);
//        System.out.println(map);
        map.entrySet().stream().filter(l->l.getValue()<50).map(l->{
           sets.add(l.getKey());
           return sets;
        }).forEach(l->{});

        for(String s : sets){
            map.remove(s);
        }
        System.out.println(map);




    }*/
static void main() {
    HashMap<String, Double> map = new HashMap<>();
    map.put("Gunay",3500.00);
    map.put("Arzu",2000.10);
    map.put("Gunel",800.0);
    map.put("Gulchin",500.0);
    HashSet<String> set = new HashSet<>();
    System.out.println(map.entrySet().stream().filter(l->l.getValue()>1000).count());
    OptionalDouble average = map.entrySet().stream().mapToDouble(l -> l.getValue()).average();

    System.out.println(average.getAsDouble());
    map.entrySet().stream().filter(l->l.getValue()<1000).
            map(Map.Entry::getKey).forEach(set::add);
    for(String key:set){
        map.remove(key);
    }
    System.out.println(map);
}
}
//departament map(isci)
