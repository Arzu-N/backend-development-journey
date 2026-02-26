package Friday;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Departament {
    static int count=0;
    static double sum=0;
    static void main() {
        System.out.println();
        HashMap<String, Map<String,Double>> map = new HashMap<>();
        map.put("IT",new HashMap<String,Double>(Map.of("Arzu",3500.0,"Gunay",4000.0,
        "Gunel",1000.0,"Nigar",800.0)));
        map.put("Muhasibatliq",new HashMap<String,Double>(Map.of("Zahra",500.0,"Gulchin",600.0,
                "Nemet",1000.0,"Farid",800.0)));
        map.put("HR",new HashMap<String,Double>(Map.of("Samir",1000.0,"Meleyke",2000.0,
                "Qorxmaz",800.0,"Aqsin",2000.0)));

       String dp="HR";


        Optional<Map<String, Double>> map1 = map.entrySet().stream().
                filter(l -> l.getKey().equals(dp)).map(
                        Map.Entry::getValue).findFirst();
        map1.ifPresent(
                       e->{
                           long count = e.size();
                           double sum = e.values().stream().mapToDouble(Double::doubleValue).sum();
                           Set<String> set = e.entrySet().stream().filter(d -> d.getValue() < 1000).
                                   map(Map.Entry::getKey).collect(Collectors.toSet());
                           map1.get().entrySet().removeIf(l->set.contains(l.getKey()));
                           System.out.println(dp+" departamentindeki isci sayi: "+count+"\n"+
                                   dp+" departamentindeki iscilerin masslarinin cemi: "+sum+"\n" +
                                   dp+" departamentindeki maasi 1000-den asagi olan iscilerin silinmesinden sonraki isci siyahisi: "+
                                   map1.orElse(new HashMap<>()));
                       }
                );


    }
}
