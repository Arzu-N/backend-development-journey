import java.io.File;
import java.io.FileInputStream;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // public static void main(String[] args) {}
//char herf ='a';
//      char herf1=(char)(herf+1);
//        System.out.println(herf1);
//        int b='9';
//        System.out.println(b);
//        System.out.println((int)pow(4,2));
//        System.out.println(pow(4,3));
//        System.out.println(60/(1.64*1.64));
//        String name="Arzu";
//        System.out.println(name.lastIndexOf("zuu"));
//        System.out.println(name.indexOf("zuu"));
//        System.out.println(name.indexOf("zuu"));
//System.out.println(name.indexOf("zuu"));
//        System.out.println(name.contains("Arzu"));
//
//        System.out.println(name.charAt(3));

//        System.out.println("hello my friend \"arzu\"");
//        Scanner scanner = new Scanner(System.in);
//        float v = scanner.nextFloat();
//        System.out.println(v);

//        Random random = new Random();
//        int i = random.nextInt(3);
//        System.out.println(i);

//        long l = new Scanner(System.in).nextLong();
//        String s=""+l;
//        System.out.println(l/10000000000l);
//        System.out.println(s.length());
//        if(l/10000000000l==0){
//            System.out.println("0la baslaya bilmez");
//        }
//        if(s.length()!=11){
//            System.out.println("uzunluq 11 olmalidir");
//        }
//        if((l%10)%2!=0){
//            System.out.println("son reqem cut olmalidir");
//        }

//
//        int sayi=new Scanner(System.in).nextInt();
//        int birler=sayi%10;
//        int onlar=sayi/10%10;
//        int yuzler=sayi/100%10;
//        switch(yuzler){
//            case 1:
//                System.out.println("yuz");
//                break;
//            case 2:
//                System.out.println("ikiyuz");
//                break;
//            case 3:
//                System.out.println("ucyuz");
//                break;
//            case 4:
//                System.out.println("dortyuz");
//                break;
//            case 5:
//                System.out.println("besyuz");
//                break;
//            case 6:
//                System.out.println("altiyuz");
//                break;
//            case 7:
//                System.out.println("yediyuz");
//                break;
//            case 8:
//                System.out.println("sekizyuz");
//                break;
//            case 9:
//                System.out.println("dokuzyuz");
//                break;
//        }
//
//        switch(onlar){
//            case 1:
//                System.out.println("on");
//                break;
//            case 2:
//                System.out.println("yirmi");
//                break;
//            case 3:
//                System.out.println("otuz");
//                break;
//            case 4:
//                System.out.println("kirk");
//                break;
//            case 5:
//                System.out.println("elli");
//                break;
//            case 6:
//                System.out.println("altmis");
//                break;
//            case 7:
//                System.out.println("yetmis");
//                break;
//            case 8:
//                System.out.println("seksen");
//                break;
//            case 9:
//                System.out.println("doksan");
//                break;
//        }
//
//        switch(birler){
//            case 1:
//                System.out.println("bir");
//                break;
//            case 2:
//                System.out.println("iki");
//                break;
//            case 3:
//                System.out.println("uc");
//                break;
//            case 4:
//                System.out.println("dort");
//                break;
//            case 5:
//                System.out.println("bes");
//                break;
//            case 6:
//                System.out.println("alti");
//                break;
//            case 7:
//                System.out.println("yedi");
//                break;
//            case 8:
//                System.out.println("sekiz");
//                break;
//            case 9:
//                System.out.println("dokuz");
//                break;
//        }

//        int [] arr= {1,7,8};
//        System.out.println(arr);
//

//    String metin="Bu gun cuma.Iyigunler.Kendine iyi bak.";
//      //  String[] cumleler = metin.split("\\.");
//        String[] cumleler = metin.split("");
//        System.out.println(cumleler.length);
//        System.out.println(metin.length());

//        Scanner sc=new Scanner(System.in);
//        int sayi = sc.nextInt();
//        int sayi1=sayi;
//        int i=0;
//        while(sayi>0){
//     sayi=sayi/10;
//     i++;
//        }
//        System.out.pri tln(i);
//        int[]arr=new int[i];
//       i=0;
//        while(sayi1>0){
//            arr[i++]=sayi1%10;
//            sayi1=sayi1/10;
//        }
//        System.out.println(i);
//      while((i-1)>=0){
//          System.out.print(arr[i-1]+" ");
//          i--;
//      }


//        double karekok=1;
//        for(double i=1.000;i*i<=9;i+=0.001){
//            karekok=i;
//        }
//        String format = String.format("%.5f", karekok);
//        System.out.println(format);


//        Scanner sc = new Scanner(System.in);
//        String[] arr = new String[4];
//        String bos = "";
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//          int say=1;
//            if (!(bos.contains(arr[i]))) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if(arr[i].equals(arr[j])){
//                        say++;
//                    }
//                }
//                System.out.println(arr[i]+" "+say);
//                bos+=arr[i];
//            }
//        }


//        byte a;
//        int b=1209;
//        a=(byte)b;
//        System.out.println(a);


//       String a="true";
//        boolean b = Boolean.parseBoolean(a);
//        System.out.println(b);

//        String a="567.908";
//        double v = Double.parseDouble(a);
//        System.out.println(v);
//        System.out.println(String.valueOf(567.908));
//        System.out.println(Integer.valueOf(34));

//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println("salam");

    // System.out.println(Integer.MAX_VALUE);


//    public static void main(String[] args) {
//
//     int[]arr={100,90,80,70,80};
//        System.out.println(siralimi(arr));
//    }
//public static boolean siralimi(int[]arr){
//    boolean flag=true;
//    for (int i = 0; i < arr.length-1 ; i++) {
//
//        if(arr[i]<arr[i+1]){
//            flag=false;
//            break;
//        }
//    }
//    return flag;
//}

//public static void main(String[] args) {
//    String password="5757";
//    System.out.println(check(password));
//}
//public static boolean check(String password){
//    boolean flag1=false;
//    boolean flag2=false;
//    for (int i = 0; i <password.length(); i++) {
//        if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
//            flag1=true;
//        }
//        else if((password.charAt(i)>='a'&&password.charAt(i)<='z')||(password.charAt(i)>='A'&&password.charAt(i)<='Z')){
//            flag2=true;
//        }
//    }
//boolean result=flag1&&flag2;
//    return result;
//}


//    int a=200;
//
//    public static void main(String[] args) {
//        System.out.println(new Main().a);
//    }


//    public static void main(String[] args) {
////        ArrayList a = new ArrayList();
////        a.add(3);
////        a.add("salam");
////        System.out.println(a);
//
//
//        String []arr1={"2.5","8.7"};
//        Object []arr=arr1;
//        arr[0]=2.5;
//        System.out.println(Arrays.toString(arr));  //covariant

//}
//public static void main(String[] args) {
//    List list=new ArrayList();
//    list.add("A");
//    list.add("B");
//    list.add(0,"C");
//    System.out.println(list);
//}
//public static void main(String[] args) {
//    LinkedList list = new LinkedList();
//    list.add("A");
//    list.add("B");
//    list.addFirst("head");
//    list.addLast(null);
//    list.add("A");
//
////    list.remove("A");
////    list.remove(0);
////    list.removeFirst();
////    list.removeLast();
//   // System.out.println(list.getFirst());
////    list.clear();
//
//  //  System.out.println(list.get(2));
//   // System.out.println( list.indexOf("head"));
//   // System.out.println(list.contains("salam"));
//    System.out.println(list.isEmpty());
//   // System.out.println(list.get(2));
//    System.out.println(list.toArray());
//    System.out.println(list.toString());
//    }
//public static void main(String[] args) {
////    HashSet hashSet = new HashSet();
////    hashSet.add("A");
////    hashSet.add("B");
////    hashSet.add("C");
////    hashSet.add("salam");
////    hashSet.add("alma");
////    System.out.println(hashSet);
//
////    TreeSet treeSet = new TreeSet();
////    treeSet.add("A");
////    treeSet.add("B");
////    treeSet.add("C");
////    treeSet.add("salam");
////    treeSet.add("alma");
////    System.out.println(treeSet);
//
//
//    HashMap <String,Integer>hashMap = new HashMap<>();
//    hashMap.put("Arzu",23);
//    hashMap.put("Sevda",25);
//    hashMap.put("67",26);
//hashMap.put("Sevda",34);
//    System.out.println(hashMap);
//    System.out.println(hashMap.get("Arzu"));
//    System.out.println(hashMap.containsKey("Arzu"));
//    System.out.println(hashMap.containsValue(26));
//    System.out.println(hashMap.keySet());
//    System.out.println(hashMap.values());
//    System.out.println(hashMap.entrySet());
//  //  hashMap.remove("Sevda");
//    System.out.println(hashMap);
//    hashMap.replace("Sevda",45);
//
//    for(Map.Entry<String,Integer>entry:hashMap.entrySet()){
//    //System.out.println(entry);
//        System.out.println(entry.getKey());
//
//}
//}
//public static void main(String[] args) {
//    ArrayList list = new ArrayList();
//    list.add("a");
//    list.add("b");
//
//    Iterator iterator = list.iterator();
//    System.out.println(iterator.hasNext());
//    System.out.println(iterator.next());
//    System.out.println(iterator.hasNext());
//    iterator.remove();
//    System.out.println(iterator.next());
//    System.out.println(list);
//}
//public static void main(String[] args) {
//    ArrayList list = new ArrayList();
//    list.add("a");
//    list.add("b");
//    list.add("c");
//    ListIterator iterator = list.listIterator();
//
//    System.out.println(iterator.next());
//    iterator.set("alma");
//    iterator.add("Sevdaa");
//    System.out.println(iterator.next());
//    System.out.println(iterator.next());
//
//
//
//
//    System.out.println(list);
//    System.out.println(iterator.hasPrevious());
//    System.out.println(iterator.previous());
//    System.out.println(iterator.previous());
//    System.out.println(iterator.previous());
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int divide=0;
//    try{
//        divide=a/b;
//    }
//    catch(ArithmeticException e){
//        System.out.println("Excepyion bas verdi "+e);
//    }
//    finally{
//        System.out.println("Emeliyyat icra olundu");
//    }
//    System.out.println("netice  "+divide);
//}
//public static void main(String[] args) {
//    int a=1;
//    int b=0;
//    try{
//        if(b==0)
//            throw new ArithmeticException();
//        else
//            System.out.println(a/b);
//    }
//    catch(ArithmeticException e){
//        System.out.println("Exception bas verdi "+e);
//    }
//    System.out.println("...");
//}
public static void main(String[] args) {
//    int a=2;
//    int b=0;
//    try{
//    System.out.println(divide(a,b));}
//    catch(ArithmeticException e){
//        System.out.println("Exception bas verddi "+e);
//    }
//    System.out.println("...");
try{
    read();
   }
catch(Exception e){
e.printStackTrace();
}
    System.out.println("alt setir");
}
public static int divide(int a,int b)throws ArithmeticException{
    return a/b;
}
public static void read() throws Exception{

    FileInputStream file = new FileInputStream(new File("adress"));

}
}

