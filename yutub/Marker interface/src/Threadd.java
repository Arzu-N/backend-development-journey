import java.util.concurrent.*;

public class Threadd extends Thread{
    private String name;
    Threadd(String name){
        this.name=name;
    }
    @Override
    public  void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name+"  say:  "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(name+" dayandi");
            }
        }
    }}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Thread isleyir");
    }
}
class Main{
/*    public static void main(String[] args) {
        Threadd t1 = new Threadd("thread1");
        Threadd t2 = new Threadd("thread2");
        t1.start();
        t2.start();
        System.out.println("mainin icindeki");
        new Thread(()-> System.out.println("hello")).start();
    }*/

   /* public static void main(String[] args) {

        new Thread(new MyRunnable()).start();
    }*/


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> call=()->{
            Threadd.sleep(1000);
            return "is bitdi";
        };
        ExecutorService exec = Executors.newSingleThreadExecutor();
        Future<String> submit = exec.submit(call);
        System.out.println("start");
        System.out.println("end: "+submit.get());
        exec.shutdown();
    }
}
