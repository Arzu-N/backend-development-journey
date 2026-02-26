package Tuesday;

import java.util.*;

public class Task1 {
/*    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
       queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.poll();
        System.out.println(queue.peek());
    }*/


   /* public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Arzu");
        queue.add("Gunay");
        queue.add("Gunel");
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext()){
        queue.poll();
        }
        System.out.println(queue+" queue boshdur ");
    }*/

    /*public static void main(String[] args) {
        Queue<String>mushteri=new LinkedList<>();
        mushteri.add("mushteri1");
        mushteri.add("mushteri2");
        mushteri.add("mushteri3");
        while(!mushteri.isEmpty()){
            String peek = mushteri.peek();
            mushteri.poll();
            System.out.println(peek+"-nin emeliyyati tamamlandi");
        }
    }*/


   /* public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("Baku");
        set.add("Ganja");
        set.add("Sumgayit");
        Iterator<String> iterator = set.iterator();
        boolean f=false;
        while (iterator.hasNext()){
             f=iterator.next().equals("Ganja");
        }
        if(f) System.out.println("var");
        else System.out.println("yoxdur");
    }*/

   /* public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 5);
        System.out.println(new HashSet<Integer>(list));
            }*/
  /* public static void main(String[] args) {
       Queue<String> q = new PriorityQueue<>();
       q.add("Arzu");
       q.add("Gunay");
       q.add("Gunel");
       Iterator<String> iterator = q.iterator();
       while(iterator.hasNext()){
           System.out.println( iterator.next());
       }
       System.out.println(q);
   }*/

/*    public static void main(String[] args) {
        HashSet<Integer> set3 = new HashSet<>();
        HashSet<Integer> set4 = new HashSet<>();
        HashSet<Integer> set5 = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 13, 40, 5, 6, 47, 7, 0, 9, 11));
        for(Integer i : set1){
            for(Integer j : set2){
                if(i.equals(j)){
                   set3.add(i);
                }
            }
        }
        System.out.println(set3);
        set4.addAll(set1);
        set4.addAll(set2);
        for(Integer i : set4){
            boolean f=false;
            for(Integer j : set3){
                if(i.equals(j)){
                    f=true;
                }
            }
            if(!f){
              set5.add(i);
            }
        }
        System.out.println(set5);
    }*/

}
//retainAll