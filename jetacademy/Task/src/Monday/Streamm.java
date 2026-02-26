package Monday;

import java.util.*;

public class Streamm {
    static void main() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

     //   List<Integer> list1 = list.stream().map(l -> l * 10).filter(l -> l > 300 && l % 2 == 0).sorted(Collections.reverseOrder()).toList();
        List<Integer> list1 = list.stream().map(l -> l * 10).filter(l -> l > 300 && l % 2 == 0).sorted(Comparator.comparing(Integer::intValue)).toList().reversed();
        System.out.println(list1);
for(Integer l:list1){

}
    }
    //10 vur 300den boyukletiri gotur sirala
}
