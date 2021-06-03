//abstract class - define and declare
//Interface -> declare -> 1.7
//1.8 can default method in interface
interface Demo{
    void show();
    //default method
    default void hello(){
        System.out.println("Hello");
    }
}
class DemoExp implements Demo{
    public void show(){
        System.out.println("Im the Best");
    }
}
public class DefaultMethodInterface {
    public static void main(String[] args) {
        
        Demo n = new DemoExp();
        n.show();
        n.hello();
    }
    
}
