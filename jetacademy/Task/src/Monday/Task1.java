package Monday;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    static void main()throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("task.txt",true));
        Scanner sc = new Scanner(System.in);
        String w;
        while(true){
            w=sc.nextLine();
            if(!w.isEmpty()){
        bw.write(w);
        bw.newLine();
        }
            else{break;
        }}
        sc.close();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("task.txt"));
        String l;
        while((l=br.readLine())!=null) {
            String[] s = l.trim().split("\\s+");
            if(s.length!=3){
                System.out.println("yalnis format");
                continue;
            }
            switch (s[1]) {
                case "+" ->
                        System.out.println(s[0] + " " + s[1] + " " + s[2] + " = " + (Integer.parseInt(s[0]) + Integer.parseInt(s[2])));
                case "-" ->
                        System.out.println(s[0] + " " + s[1] + " " + s[2] + " = " + (Integer.parseInt(s[0]) - Integer.parseInt(s[2])));
                case "*" ->
                        System.out.println(s[0] + " " + s[1] + " " + s[2] + " = " + (Integer.parseInt(s[0]) * Integer.parseInt(s[2])));
                case "/" ->{
                    if(Integer.parseInt(s[2])==0){
                        System.out.println("0 a bolme olmaz");
                    }
                    else{
                        System.out.println(s[0] + " " + s[1] + " " + s[2] + " = " + (Integer.parseInt(s[0]) / Integer.parseInt(s[2])));
                }}
            }

        }

    }}

