//Runnable Interface is Functional Interface
//we can use use Lambda Expression
public class RunnableLambdaExpression{
    public static void main(String[] args) {

        Thread t1 = new Thread( () ->
                                {
                                    public void run(){
                                        for(int i=1;i<=5;i++){
                                            System.out.println("Hi");
                                            try{Thread.sleep(1000);} catch(Exception e){}
                                        }
                                    } 
                                });
        Thread t2 = new Thread( () -> 
                                {
                                    public void run(){
                                        for(int i=1;i<=5;i++){
                                            System.out.println("Hello");
                                            try{Thread.sleep(1000);} catch(Exception e){}
                                        }  
                                    }
                                }); 
        
        t1.start();
        t2.start();
    }
}
/*
Runnable a = () ->
                        {
                            public void run(){
                                for(int i=1;i<=5;i++){
                                    System.out.println("Hi");
                                    try{Thread.sleep(1000);} catch(Exception e){}
                                }
                            } 
                        };
        Runnable b = () -> 
                        {
                            public void run(){
                                for(int i=1;i<=5;i++){
                                    System.out.println("Hello");
                                    try{Thread.sleep(1000);} catch(Exception e){}
                                }  
                            }
                        };
                        
        Thread t1 = new Thread(a);  
        Thread t2 = new Thread(b); 
        
        t1.start();
        t2.start();
        */
