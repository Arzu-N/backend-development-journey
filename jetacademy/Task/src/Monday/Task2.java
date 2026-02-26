package Monday;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String sentence1 = sentence.replace(" ", "_");
        String substring = sentence1.substring(0, 5);
        String[] arr = sentence.split(" ");
        int i=0;
        System.out.print("deyisdirilmis cumle: "+sentence1+"\nilk 5 simvol: "+substring+"\nsozler massivi: \n");
        for(String a:arr){System.out.println("arr["+ i+"]="+a+" ");i++;}
        //Salam.menim adim Arzudur.
    }

}
