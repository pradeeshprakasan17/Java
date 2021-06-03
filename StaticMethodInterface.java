interface Demo{
    int num = 9;  //variable inside interface is final
    //static method
    void show();
    static void hello(){
        System.out.println("Hello");
    }
}
class DemoExp implements Demo{
    public void show(){
        System.out.println("Im the Best");
    }
}
public class StaticMethodInterface {
    public static void main(String[] args) {
        
        Demo.hello();
    }
    
}