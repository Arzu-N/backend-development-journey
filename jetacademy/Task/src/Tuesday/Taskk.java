package Tuesday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Taskk {
    /* static void main() {
        int[][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=j;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }*/

   /* static void main() {
        int[][][]arr={
            {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
            },
            {
                {13,14,15,16},{17,18,19,20},
            },
            {
                {21,22,23,24,25}
            }
        };
        System.out.println(arr[2][0][3]);
    }*/

    static void main() {
        Map<String, Map<String, Integer>> order = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int c = 0;
        order.put("Arzu", Map.of("telefon", 2, "notebook", 4, "kitab", 1));
        order.put("Gunay", Map.of("komputer", 1, "televizor", 1));
        order.put("Gunel", Map.of("notebook", 5));
        int max = order.get("Arzu").get("telefon");
        String name = "";
        for (Map.Entry<String, Map<String, Integer>> k : order.entrySet()) {
            System.out.println(k.getKey());
            for (Map.Entry<String, Integer> m : (k.getValue()).entrySet()) {
                System.out.println(" " + m);
                count += m.getValue();
                if (m.getValue() > max) {
                    max = m.getValue();
                    name = k.getKey();
                }
                c++;
            }
            if (c < 2) {
                list.add(k.getKey());
            }
            c = 0;
        }
        for(String key : list) {
            order.remove(key);
        }
        System.out.println("umumi mehsul sayi: " + count);
        System.out.println("mehsul sayinin ortalamasi: " + count / order.size());
        System.out.println("en cox sifarisi olan musteri: " + name);
        System.out.println(order);
    }
}
