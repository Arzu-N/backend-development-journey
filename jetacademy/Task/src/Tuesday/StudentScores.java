package Tuesday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScores {
    static void main() {
        HashMap <String,Integer>map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        double sum=0;
        boolean f=false;
        map.put("Arzu",100);
        map.put("Gunay",90);
        map.put("Gunel",92);
        map.put("Sema",30);
        double max=map.get("Arzu");
       for(Map.Entry<String,Integer>e:map.entrySet()){
           sum+=e.getValue();
           if(max<e.getValue()) max=e.getValue();
       }
        System.out.println("Telebeler ve ballari :"+map.entrySet()+"\n" +
                "Orta bal: "+(sum/map.size())+"\n" +
                "En yuksek bal alan: "+max+"\n" +
                "50-den chox bal alan telebeler: ");
       for(Map.Entry<String,Integer>e:map.entrySet()){
           if(e.getValue()>50){ System.out.print(e+" ");
           f=true;}
       }
       if(!f) System.out.print("50-den cox bal alan telebe yoxdur");
        System.out.println();
        String name = sc.nextLine();
        if(map.containsKey(name)) System.out.println(map.get(name));
    else{
            System.out.println(name+" adli telebe tapilmadi");
        }
    }


}
