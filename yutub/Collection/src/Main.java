import java.util.*;
import java.util.concurrent.BlockingQueue;

public class Main {
 /*   public static void main(String[] args) {
*//*Integer[]a=new Integer[3];
Number[]num=a;
num[0]=1;
num[1]=2;
num[2]=3;*//*
      *//*  Animal a = new Animal("Arzu", "23");
        System.out.println(a.name+" "+a.age);*//*
*//*
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st.pop());
        for (Integer s:st) {
            System.out.println(s);
        }*//*

        *//*Vector<Integer> v=new Vector<>();
        v.add(3);
        v.add(4);
        v.add(2);
        v.add(2);
        v.add(2);
        v.add(6);
        v.set(5,4);
        System.out.println(v.capacity());
        System.out.println(v.get(5));
        v.trimToSize();
        System.out.println(v.capacity());*//*

     *//*   Queue<Integer> queue=new LinkedList<>();
        Deque<Integer> queue1=new LinkedList<>();
        BlockingQueue<Integer> queue2=new LinkedList<>();
         Stack<Integer> stack=new Stack<>();*//*

     *//*   Queue<Integer>q=new PriorityQueue<>();
        q.add(23);
        q.add(28);
       q.add(-78);
       q.add(2);
       q.add(10);
       q.add(1);*//*
    //    System.out.println(q);
       *//* System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());*//*


     *//*          Queue<Integer>q=new PriorityQueue<>(new Comparatorr());
        q.add(23);
        q.add(28);
       q.add(-78);
       q.add(2);
       q.add(10);
       q.add(1);
        //    System.out.println(q);
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
        System.out.println( q.poll());
    }*//*

       *//* ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(1);
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollFirst());*//*
       *//* ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(0);
        list.add(1);
        list.set(1,19);
        list.add(1,23);
        System.out.println(list);*//*

       *//* LinkedList list = new LinkedList();
        list.add(1);
        list.add(0);
        list.add(-9);
        list.add(1,16);
        System.out.println(list);*//*

*//*        HashSet <String>set = new HashSet<>();
        set.add("alma");
        set.add("heyva");
        set.add("nar");
        set.add("limon");
        System.out.println(set);

        LinkedHashSet<String> sets = new LinkedHashSet<>();
        sets.add("alma");
        sets.add("heyva");
        sets.add("nar");
        sets.add("limon");
        System.out.println(sets);*//*

        TreeSet<Integer> set = new TreeSet<>(new Comparatorr());
        set.add(89);
        set.add(2);
        set.add(-8);
        set.add(5);
        System.out.println(set);
        Map
    }}
     class Comparatorr implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            int data=o1.compareTo(o2);
            if(data>0)return -1;
            else if(data<0)return 1;
            else return 0;
        }*/
/*
    public static void main(String[] args) {
   *//*     HashMap<String,Integer> map=new HashMap<>();
        map.put("Ehmed",123);
        map.put("Sema",236);
        map.put("Arzu",148);
        System.out.println(map);
        for(String k:map.keySet()){
            System.out.println(map.get(k));
        }
        LinkedHashMap<Character, String> map1 = new LinkedHashMap<>();
        map1.put('A',"alma");
        map1.put('C',"limon");
        map1.put('B',"banan");
        System.out.println(map1);*//*
        TreeMap<Integer,String>map=new TreeMap<>(new Comparatorr());
        map.put(1,"bir");
        map.put(5,"bes");
        map.put(2,"iki");
        System.out.println(map);
    }
    }class Comparatorr implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        int data=o1.compareTo(o2);
        if(data>0)return -1;
        else if(data<0)return 1;
        else return 0;
    }*/

  /*  public static void main(String[] args) {
      //  new Outer().print();
        StringBuilder s=new StringBuilder();
//        for( long i=0;i<1000000000000000000l;i++)
//        {
//            s.append("s");
//            System.out.println(s);
//        }
        final Integer a=new Integer(129);
         a=180;
    }*/

/*    public static void main(String[] args) {
        *//*Priority low = Priority.MEDIUM;
        low.ordinal();*//*
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        Priority priority = Priority.valueOf(a);
       switch(priority){
           case LOW:
               System.out.println(priority.getPriority());
               break;
           case MEDIUM:
               System.out.println(priority.getPriority());
               break;
           case HIGH:
               System.out.println(priority.getPriority());
               break;
       }
    }*/

    public static void main(String[] args) {
        A a = new B();
        //B b=(B)a;
        a.sound();
        System.out.println(a.name);
    }
}
