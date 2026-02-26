import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.nanoTime;
import static jdk.nashorn.internal.objects.NativeDate.getTime;

public class Main {
    public static void main(String[] args) {
            /*{
        System.out.println(System.currentTimeMillis());
        Date a = new Date();
        System.out.println(a.getTime());
        System.out.println(System.nanoTime());
        System.out.println(Thread.activeCount());
    }*/
  /*  {
        System.out.println("before "+Thread.activeCount());
      Thread thread1=new Thread(){
            @Override
            public void run(){
           for(int i=0;i<1000;i++){
               System.out.println("Salam");
           }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("Sag ol");
                }
            }};
        thread1.start();
        thread2.start();
        System.out.println("after "+Thread.activeCount());
    }*/
      /*  {
            System.out.println("before "+Thread.activeCount());
            Runnable runnable1=new Runnable(){
                @Override
                public void run(){
                    for(int i=0;i<10;i++){
                        System.out.println("salam");
                    }
                }
        };
            Runnable runnable2=new Runnable(){
                @Override
                public void run(){
                    for(int i=0;i<10;i++){
                        System.out.println("sag ol");
                    }
                }
            };
           /* Thread thread1=new Thread(runnable1);
            Thread thread2=new Thread(runnable2);*/
            ExecutorService executor= Executors.newSingleThreadExecutor();
        //    executor.submit(runnable1);
         //   executor.submit(runnable2);
        //    System.out.println("after "+Thread.activeCount());
        //}*/

          /*  Thread.Myrunnable runnable=new Thread.Myrunnable("Salamm");
            Thread thread=new Thread(runnable);
            thread.start();
        System.out.println( runnable.isfinished());
            System.out.println(Thread.activeCount());
        }*/

    }}