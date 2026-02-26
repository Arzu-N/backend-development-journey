package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    public static int i=0;
    private Lock lock=new ReentrantLock();
    private  final Object monitor1=new Object();
    private final Object monitor2=new Object();

   /* public  void foo(){
        System.out.println("foo");
        synchronized(monitor1){
        i++;}
        System.out.println("foo");
        System.out.println("foo");
        System.out.println("foo");
    }
    public  void foo2(){
        System.out.println("hello");
        synchronized(monitor2){
        i++;}
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }*/
  /* public  void foo(){
       System.out.println("foo");
       lock.lock();
       try{
     i++;}
       finally{
           lock.unlock();
       }
       System.out.println("foo");
       System.out.println("foo");
       System.out.println("foo");
   }
    public  void foo2(){
        System.out.println("hello");
        synchronized(monitor2){
            i++;}
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }*/
  /*  public void foo(){
        System.out.println("dd1");
        synchronized(monitor1){
            System.out.println("dd2");
            synchronized(monitor2){
                System.out.println("dd3");
            }
        }
        System.out.println("foo");
        System.out.println("foo");
        System.out.println("foo");
    }
    public void foo2(){
        System.out.println("sss1");
        synchronized(monitor2){
            System.out.println("ss2");
            synchronized(monitor1){
                System.out.println("ss3");
            }
        }
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }*/
   public void foo(){
       System.out.println("dd1");
       synchronized(monitor1){
           System.out.println("dd2");
           try{
               Thread.sleep(100);}
               catch(InterruptedException e){
                   e.printStackTrace();
               }
           synchronized(monitor2){
               System.out.println("dd3");
           }
       }
       System.out.println("foo");
       System.out.println("foo");
       System.out.println("foo");
   }
    public void foo2(){
        System.out.println("sss1");
        synchronized(monitor2){
            System.out.println("ss2");
            try{Thread.sleep(100);}
            catch(InterruptedException e){
                e.printStackTrace();
            }
            synchronized(monitor1){
                System.out.println("ss3");
            }
        }
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }
}
