package Thread;

import java.util.concurrent.Callable;

public class Mycallable1 implements Callable <Myobj>{
    private  int time;

    public int getTime() {
        return time;
    }

    public Mycallable1(int time){
    this.time=time;
}
        public Myobj call() throws InterruptedException {
            Myobj obj=new Myobj();
           Thread.sleep(time);
            System.out.println(time+" qeder gozledi");
            obj.inc();
            return obj;
        }

    }
