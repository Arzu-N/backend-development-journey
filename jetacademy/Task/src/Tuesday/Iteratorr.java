package Tuesday;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteratorr {
 /*   static void main() {
        int[] arr=new int [5];

        for(int i=0;i<5;i++){
            arr[i]=i;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }*/

    static void main() {
        List<Integer> list = List.of(3,5,6,23,6);
        List<Integer> odd = new ArrayList();
        List<Integer> even = new ArrayList();

        //   Iterator<Integer> iterator = list.iterator();
        Iterator<Integer> it = list.iterator();
       /* while(iterator.hasNext()){
           Integer a=iterator.next();
            if(a%2==0)
            System.out.println(iterator.next());
        }*/
        Integer maxEven=null;
        Integer maxOdd=null;
        Integer minEven=null;
        Integer minOdd=null;
        int sumEven=0;
        int sumOdd=0;
        while(it.hasNext()){
            Integer a=it.next();
            if(a%2==0){
                even.add(a);
                sumEven+=a;
                if(maxEven==null||a>maxEven){
                    maxEven=a;
                }
                 if (minEven==null||a<minEven){
                    minEven=a;
                }
            }
            else{
                sumOdd+=a;
                odd.add(a);
                if(maxOdd==null||a>maxOdd){
                    maxOdd=a;
                }
                 if (minOdd==null||a<minOdd){
                    minOdd=a;
                }
        }}
        System.out.printf("cutler:%s,cutlerin maxi:%d,cutlerin min-u:%d,cemi%d%n",even,maxEven,minEven,sumEven);
        System.out.printf("tekler:%s,teklerin maxi:%d,teklerin min-u:%d,cemi%d%n",odd,maxOdd,minOdd,sumOdd);

    }
}
