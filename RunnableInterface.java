class Hi implements Runnable{
    //start can execute run method
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class RunnableInterface{
    public static void main(String[] args) {

        Runnable a = new Hi();
        Runnable b = new Hello();

        //Runnable does not have start method , Thread can have it
        //Create object of Thread
        Thread t1 = new Thread(a);  // link runnable object with Thread
        Thread t2 = new Thread(b); 
        
        
        //Start method of Thread
        t1.start();
        t2.start();

    }
}