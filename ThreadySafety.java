import java.util.concurrent.atomic.AtomicInteger;

/*
Thread Safety can be done in two ways
Synchronized Keyoword
public synchronized void increment(){
        count++;

    }


    Atomic Integer
*/
class Counter{
    AtomicInteger count;
    public void increment(){
        count.incrementAndGet();
    }
}
public class ThreadSafety{
    public static void main(String[] args) throws Exception{
        
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable()
                                {
                                    public void run(){
                                        for(int i=1;i<=1000;i++){
                                            c.increment();
                                        }
                                    }

                                });

        Thread t2 = new Thread(new Runnable()
                                {
                                    public void run(){
                                        for(int i=1;i<=1000;i++){
                                            c.increment();
                                        }
                                    }

                                });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count = "+c.count);
    }
}