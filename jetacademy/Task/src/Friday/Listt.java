package Friday;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Listt {
    static void main() {
       /* List<Integer> list1 = Arrays.asList(12, 5, 78, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 15, 18, 7, 19);
        System.out.println( Stream.of(list1, list2).flatMap(Collection::stream).filter(e -> e % 2 == 0).
                collect(Collectors.toList()));
        System.out.println( Stream.of(list1, list2).flatMap(Collection::stream).count());
        System.out.println(Stream.of(list1, list2).flatMap(Collection::stream).max(Comparator.naturalOrder()).orElse(null));
*/



        List<String> list1 = Arrays.asList("alma", "armud", "heyva");
        List<String> list2 = Arrays.asList("nar", "banan", "qarpiz");
        System.out.println(Stream.of(list1, list2).flatMap(Collection::stream).toList().size());
        //  mapToInt(Collection::size).sum());
        System.out.println(Stream.of(list1,list2).flatMap(Collection::stream).mapToInt(String::length).
                sum());
        System.out.println(Stream.of(list1, list2).flatMap(Collection::stream).map(l -> (l.charAt(0) + "")
                .toUpperCase()+l.substring(1)).collect(Collectors.toList()));

        System.out.println(Stream.of(list1, list2).flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList()));

    }}
