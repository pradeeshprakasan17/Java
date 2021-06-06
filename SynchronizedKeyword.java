class Counter{
    int count;
    //synchronized - t1 executes t2 wait - t2 executes t1 wait
    public synchronized void increment(){
        count++;
    }
}
public class SynchronizedKeyword{
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