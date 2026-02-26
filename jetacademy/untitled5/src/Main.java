import java.util.Scanner;

public class Main {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
      *//*  for(int i=n.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }*//*
        a(n);
    }
    public static void a(String n){
        String a= n.charAt(0)+"";
        System.out.print(a.toUpperCase());
        for(int i=1;i<n.length();i++){
            System.out.print(n.charAt(i));
        }
    }*/

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        num=Math.abs(num);
       sum(num);
    }
    public static void sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        System.out.println(sum);
    }*/

    public static void main(String[] args) {
        int[] arr = {4, 11, 6, 7, 8, 8, 9, 9, 10, 10, 8, 7, 7, 11};
      /*  max(arr);
    min(arr);
       sum(arr);*/
        boolean f = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    f = true;
                    count++;
                }
            }
            if (f && count == 1) {
                System.out.print(arr[i] + " ");
            }
            f = false;
            count = 0;
        }
        //brend,model,color,capasity

    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

//kredit odenisi ,odenisi odemyen musterinin adin cixar ve ekrana  yaz ki borcunu ode