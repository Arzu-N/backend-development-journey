package Monday;

public class Stringg {
   /* public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean f=false;
        char[]arr={'Ç','ç' ,'Ə', 'ə', 'Ğ', 'ğ', 'Ö', 'ö', 'Ü', 'ü','Ş', 'ş', 'Ü', 'ü'};
        for(char a:arr){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==(a)){
                    System.out.println("uygun olmayan format");
                    f=true;
                    break;
                }

            }
            if(f)break;
        }

    }*/

//public static void main(String[] args) {
//    String  []arr={"Gunay","Gunel","Arzu","Nigar"};
//    boolean f=false;
//    int c=0;
//        for(String s:arr){
//            if(s.contains("Arzu")){
//                System.out.println("Yes");
//                c++;
//                break;
//
//            }
//            else f=true;
//        }
//        if(f&&c==0){
//            System.out.println("no");
//        }
//    }

  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        System.out.println("name: "+s1[0]+" surname: "+s1[1]+" age: "+Integer.parseInt(s1[2]));
    }*/

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstLetterUpperCase(s));
    }
        public static String firstLetterUpperCase(String name){
            return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

    }*/

    public static void main(String[] args) {

    String s="kompüter şəƏbəkəsi";
        String s1 = s.replace("ü", "u")
                .replace("ə", "e")
                .replace("ş", "sh");
        System.out.println(s1);
    }}


