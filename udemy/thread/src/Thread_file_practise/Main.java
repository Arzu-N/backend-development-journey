package Thread_file_practise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception{
        File_write filewrite1=File_write.instance("text1.txt","salam",1000,File_write.WRITE_TYPE.IO);
        File_write filewrite2=File_write.instance("text1.txt","Sag ol",1000, File_write.WRITE_TYPE.IO);
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.submit(filewrite1);
        executor.submit(filewrite2);
        executor.shutdown();
        executor.awaitTermination(1,TimeUnit.MINUTES);

    }
}
