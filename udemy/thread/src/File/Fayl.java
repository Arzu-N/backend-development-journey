package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Fayl {

    public static void writetexttofile( String filepath,String msj) throws IOException {
        Files.write(Paths.get(filepath),msj.getBytes(), StandardOpenOption.APPEND);
    }
    public static void Bufferwrite(String filename,String msj)throws Exception{
       try(BufferedWriter bw=new BufferedWriter(new FileWriter(filename))){
bw.write(msj);
bw.newLine();
        }
    }
}
