package Thread;
public class Foo2{
   /* public synchronized void foo() throws InterruptedException {
        while(true){
            System.out.println("run");
            wait();
        }
    }
    public void foo2(){
        while(true){
        synchronized(this){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        notify();
    }}}*/
    public void foo(){
        for(int i=0;i<100;i++){
            System.out.println("run");
        }
    }
    public  void foo2(){
        for(int i=0;i<100;i++){
            System.out.println("run222");
        }
    }
    }
