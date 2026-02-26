package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class main3 {
  /*  public static void main(String[] args) {
        Foo2 foo=new Foo2();
        Myrunnable1 runnable1=new Myrunnable1(foo);
        Myrunnable2 runnable2=new Myrunnable2(foo);
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.submit(runnable1);
        executor.submit(runnable2);
    }*/
  /*public static void main(String[] args) throws InterruptedException {
      Foo2 foo = new Foo2();
      Myrunnable1 runnable1 = new Myrunnable1(foo);
      Myrunnable2 runnable2 = new Myrunnable2(foo);
     /* Thread thread1 = new Thread(runnable1);
      Thread thread2 = new Thread(runnable2);*/
      /*thread1.start();
      thread1.join();
      thread2.start();
      thread2.join(); //thread1 ise dusub bitir,sonra main isine davam edir sonra thread2 ise baslayir,sonra main thread2nin bitmesini gozleyir,bitdikden sonra main oz isine davam edird*/
    /*  ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
      scheduledExecutorService.schedule(runnable1,10, TimeUnit.SECONDS);}*/
  public static void main(String[] args) {
      Foo2 foo=new Foo2();
      Myrunnable1 runnable1=new Myrunnable1(foo);
      Myrunnable2 runnable2=new Myrunnable2(foo);
      Executors.newFixedThreadPool(2);
  }}