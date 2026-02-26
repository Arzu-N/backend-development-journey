public class Outer {
int a=16;
    void print(){
        int c=90;

        class  LocalInner{
            static final int b=90;

            void innerPrint(){
                System.out.println("local inner"+c);
            }
        }
        new LocalInner().innerPrint();
    }
}
