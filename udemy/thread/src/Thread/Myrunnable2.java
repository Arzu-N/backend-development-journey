package Thread;

public class Myrunnable2 implements Runnable{
    private final Foo2 foo;
    public Myrunnable2(Foo2 foo){
        this.foo=foo;
    }
    public void run(){
      /*  for(int i=0;i<1000;i++){
            Thread.Main2.i.incrementAndGet();
        }*/
foo.foo2();
}}
