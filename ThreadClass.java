class Hi extends Thread{
    //start can execute run method
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class ThreadClass{
    public static void main(String[] args) {

        Hi a = new Hi();
        Hello b = new Hello();
        
        //Start & Run method of Thread
        a.start();
        b.start();

    }
}