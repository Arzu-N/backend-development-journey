package Thread;

public class Myobj{
private volatile int processedcount;
public int getProcessedcount(){
    return processedcount;
}
public synchronized void inc(){
    processedcount++;
}
}
