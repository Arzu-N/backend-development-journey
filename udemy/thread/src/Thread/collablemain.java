package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class collablemain {
   /* public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Mycallable1 callable1=new Mycallable1();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Myobj> submit = executorService.submit(callable1);
        Myobj myobj = submit.get(1,TimeUnit.SECONDS);
        System.out.println(myobj.getProcessedcount());
    }*/
   public static void main(String[] args) throws ExecutionException, InterruptedException {
       Mycallable1 callable1=new Mycallable1(8000);
       Mycallable1 callable2=new Mycallable1(2000);
       Mycallable1 callable3=new Mycallable1(7000);
       ExecutorService executorService = Executors.newFixedThreadPool(3);
      ArrayList <Mycallable1> list=new ArrayList<>();
      list.add(callable1);
      list.add(callable2);
      list.add(callable3);
     // Myobj myobj = executorService.invokeAny(list);
       List<Future<Myobj>> futures = executorService.invokeAll(list);
       for(int i=0;i<futures.size();i++){
           Future<Myobj> myobjFuture = futures.get(i);
Myobj myobj=myobjFuture.get();
           System.out.println(myobj);
       }
       Future<Myobj> submit = executorService.submit(callable1);
       Myobj myobj=submit.get();
   }
}
