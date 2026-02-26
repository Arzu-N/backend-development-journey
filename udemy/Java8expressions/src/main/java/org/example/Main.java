package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Long.sum;

public class Main {
   /* public static void main(String[] args) {
        List<String> words = Arrays.asList("soz1", "soz2", "soz3", "soz4", "soz5");
        words.forEach(s-> System.out.println("salam "+s));
        words.forEach(System.out::println);
        Optional<String> soz1 = find(words, "soz1");
        if(soz1.isPresent()){
            System.out.println(soz1.get());
        }
        find(words, "soz1").ifPresent(System.out::println);

    }
    private static Optional<String>find(List<String>list,String s){
      /*  for(String l:list){
            if(l.equalsIgnoreCase(s))
                return Optional.of(l);

        }
        return Optional.empty();}*/
      /*  Optional<String> first = list.stream().filter(l -> l.equalsIgnoreCase(s)).findFirst();
    return first;*/

     /*public static void main(String[] args) {
       {
            Stream.of("soz1", "soz2", "soz3")
                    .filter(l->l.equalsIgnoreCase("soz2"))
                    .findFirst()
                    .ifPresent(Main::foo);
        }
    }*/
   /*  public static void main(String[] args) {
    List.of("soz1", "soz2", "soz3","soz2").parallelStream()
            .filter(l->l.equalsIgnoreCase("soz2"))
            .findAny()
                    .ifPresent(Main::foo);
}
    public static void foo(String s){
        System.out.println(s);
    }*/
   /*  public static void main(String[] args) {
         List<String> list = Arrays.asList("soz1", "soz2", "soz3");
     list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
     }*/
    /* public static void main(String[] args) {
         List<String> list = Arrays.asList("soz1", "soz2", "soz3");
         list.stream().map(s->{
             s=s.toUpperCase();
             s=s+" word";
             return s;
         }).collect(Collectors.toList()).forEach(System.out::println);
     }*/
   /*  public static void main(String[] args) {
         List<String> list = Arrays.asList("soz1", "soz2", "soz3");
         String s = list.stream().filter(l -> l.equalsIgnoreCase("soz0")).findAny().orElse("not found");
         System.out.println(s);
     }*/
   /*  public static void main(String[] args) {
         List<String> list = Arrays.asList("soz1", "soz2", "soz3");
         String s = list.stream().filter(l -> l.equalsIgnoreCase("soz0")).findAny().orElseThrow(()->new IllegalArgumentException("invalid key"));
         System.out.println(s);
     }*/
   /*  public static void main(String[] args) {
      BiFunction<String,Integer,String>sum= (a,b) -> a + b;
         System.out.println(sum.apply("Arzu",6));
     }*/
   /*  public static void main(String[] args) {
         List<List<String>> list = Arrays.asList(Arrays.asList("Hello,world!"), Arrays.asList("I am learning Java!"));
         List<String> collect1 = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
                System.out.println(collect1);
     }*/
    /* public static void main(String[] args) {
         List<String> list = Arrays.asList("Arzu", "Lale", "Camal");
         IntStream intStream = list.stream().mapToInt(String::length);
         int sum = intStream.sum();
         System.out.println(sum);
     }*/
    /* public static void main(String[] args) {
         List<String> list = Arrays.asList("soz1", "soz2", "soz3", "soz4", "soz5");
         Stream<Integer> integerStream = list.stream().map(String::length);
       //  Integer reduce = integerStream.reduce(0, (a, b) -> a + b);
         Optional<Integer> reduce = integerStream.reduce((a, b) -> (a + b));
         reduce.ifPresent(System.out::println);
     }*/
     /*public static void main(String[] args) {
         BinaryOperator<Integer>sum=(a,b)->(a+b);
         System.out.println(sum.apply(5,9));
     }*/
     public static void main(String[] args) {
             List<List<String>> list = Arrays.asList(
                     Arrays.asList("1-soz1", "1-soz2", "1-soz3"),
                     Arrays.asList("2-soz1", "2-soz2", "2-soz3"),
                     Arrays.asList("3-soz1", "3-soz2", "3-soz3")
             );
         List<List<Integer>> collect = list.stream().map(l -> l.stream().map(String::length)).map(l -> l.collect(Collectors.toList())).collect(Collectors.toList());
         System.out.println(collect);
         List<Integer> collect1 = list.stream().flatMap(l -> l.stream().map(String::length)).collect(Collectors.toList());
         System.out.println(collect1);
     }}
