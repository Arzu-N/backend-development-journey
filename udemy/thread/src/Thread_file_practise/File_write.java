package Thread_file_practise;
import File.Fayl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_write implements Runnable {
    private String message;
    private String filename;
    private int count;
    public enum WRITE_TYPE {
        IO,NIO;
    }
   private final WRITE_TYPE writetype;
     File_write(String filename, String message, int count, WRITE_TYPE writetype){
        this.filename=filename;
        this.message=message;
        this.count=count;
        this.writetype = writetype;
    }
    @Override
public void run(){
     if(writetype==WRITE_TYPE.IO){
         filewritebyio(filename,message);
     }
     else if(writetype==WRITE_TYPE.NIO){
        filewritebynio(filename,message);
     }
    }
    private  void filewritebynio(String filename,String message){
       try{
           for(int i=0;i<count;i++){
               Files.write(Paths.get(filename),(message+"\n").getBytes(), StandardOpenOption.APPEND);}}
        catch(IOException e){
            e.printStackTrace();
throw new RuntimeException();
        }}
       private void filewritebyio(String filename,String message){
            try(BufferedWriter bw=new BufferedWriter(new FileWriter(filename,true))){//burada true ona gore yazilib ki,fayl append rejiminde acilir,ve fayla yeni nese yazilanda kohneler silinmeden onun ardinca yazir
for(int i=0;i<count;i++){
    bw.write(message+" "+System.nanoTime());
    bw.newLine();
}}
            catch(Exception e){
                throw new RuntimeException();
            }
    }
     public static File_write instance(String filename,String message,int count,WRITE_TYPE writetype){
        return new File_write(filename,message,count,writetype);
    }
}



