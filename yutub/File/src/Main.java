

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 /*  faylin/qovlugun yaradilmasi,fayla melumat yazilmasi
  public static void main(String[] args) throws IOException {
       // File file = new File("info.txt");
        File file = new File("src/file/file.txt");
//        File file = new File("src/B/A1");
//        File file1 = new File("src/B/A2");
        file.createNewFile();
      // file.mkdir();
//        file.mkdirs();
//        file1.mkdirs();
      //  file.delete();
       // System.out.println(file.getName());
        FileWriter writer=new FileWriter("file.txt",true);
        writer.write("Salam dunya\n Nacasann?");
        writer.write("sag ol");
        writer.close();
    }*/

 /*  fayla yazilan melumati oxumaq
 public static void main(String[] args) {
     try{
     File file=new File("file.txt");
     Scanner sc = new Scanner(file);
     while(sc.hasNextLine()){
         String s=sc.nextLine();
         System.out.println(s);
     }
     sc.close();
 }
     catch(FileNotFoundException e){
         e.printStackTrace();
     }
     finally{

     }
    }*/

  /* fayldan melumati silmek
   public static void main(String[] args) {
    File file = new File("file.txt");
    if (file.delete()) System.out.println("File deleted successfully");
    else System.out.println("file not deleted");
    }*/

    public static void main(String[] args) {
        File file = new File("file.txt");
       /* try{

            Scanner sc = new Scanner(System.in);
            FileWriter wr=new FileWriter(file,true);
            String input;
            do{
                System.out.println("melumati daxil edin");
                 input=sc.nextLine();
                 if(!(input.equals("0")))
                     wr.write(input);
            }
            while(!(input.equals("0")));
            wr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }*/
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());
        System.out.println(file.length());
    }


}