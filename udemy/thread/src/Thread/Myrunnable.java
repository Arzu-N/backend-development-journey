package Thread;

public class Myrunnable implements Runnable{
    private String text;
    boolean finished=true;

    public Myrunnable(Foo2 foo) {
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("salam");
        }
    }
   /* public Thread.Myrunnable(String text){
        this.text=text;
    }*/
   /* public boolean isfinished(){
        return finished;
    }*/
}
