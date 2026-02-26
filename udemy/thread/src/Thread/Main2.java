package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {
    //public static int i=0;
   /* private volatile static int i;
    public synchronized static void increase(){
        i++;
    }*/
   public static AtomicInteger i=new AtomicInteger(0);

    public static void main(String[] args) throws Exception{
      /*  Myrunnable1 runnable1=new Myrunnable1();
        Myrunnable2 runnable2=new Myrunnable2();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.submit(runnable1);
        executor.submit(runnable2);
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
       // System.out.println(Thread.Main2.i);
        System.out.println(Main2.i.intValue());
    }*/
}}
