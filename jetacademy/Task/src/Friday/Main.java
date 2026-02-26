package Friday;

import java.io.*;

public class Main {
    /*static void main() throws IOException {
         int c=0;
       BufferedWriter f = new BufferedWriter(new FileWriter("hello.txt"));

        f.write("salam");
        f.newLine();
        f.write("Necesen\n Menim adim Arzudur\nMenim 23 yasim var.Alma,armud\nAygun");
        f.flush();
        BufferedReader r = new BufferedReader(new FileReader("hello.txt"));
        String line;
        while((line =  r.readLine())!=null){
           for(int i = 0;i< line.length();i++){
               if(line.toUpperCase().charAt(i) == 'A'){
                   c++;
               }
            }
        }
        System.out.println(c);
    }*/




















/*    static void main() throws IOException {
        int c=0;
        BufferedWriter f = new BufferedWriter(new FileWriter("hello.txt"));

        f.write("salam");
        f.newLine();
        f.write("Necesen\n Menim adim Arzudur\nMenim 23 yasim var.Alma,armud\nAygun");
        f.flush();
        BufferedReader r = new BufferedReader(new FileReader("hello.txt"));
       int s;
        while((s=r.read())!=-1){
            char e=(char)s;
            if(s=='A'||s=='a'){
                c++;
            }
        }
        System.out.println(c);
}*/

    static void main() throws IOException {
        int c=0;
        BufferedWriter f = new BufferedWriter(new FileWriter("hello.txt"));

        f.write("salam");
        f.newLine();
        f.write("Necesen\n Menim adim Arzudur\nMenim 23 yasim var.Alma,armud\nAygun");
        f.flush();
        BufferedReader r = new BufferedReader(new FileReader("hello.txt"));
        String s;
        while((s=r.readLine())!=null){
           for(String soz : s.split("[ ,.]")){
               if(soz.toLowerCase().startsWith("a"))c++;
           }

        }
        System.out.println(c);
    }}
//faylin icinde her lineda  5 * 10 yaziriq,capa 50ni getir